package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalResult extends js.Object {
  var bounds: Bounds
  var center: LocalResultPoi
  var city: java.lang.String
  var keyword: java.lang.String
  var moreResultsUrl: java.lang.String
  var province: java.lang.String
  var radius: scala.Double
  var suggestions: js.Array[java.lang.String]
  def getCityList(): js.Array[_]
  def getCurrentNumPois(): scala.Double
  def getNumPages(): scala.Double
  def getNumPois(): scala.Double
  def getPageIndex(): scala.Double
  def getPoi(i: scala.Double): LocalResultPoi
}

