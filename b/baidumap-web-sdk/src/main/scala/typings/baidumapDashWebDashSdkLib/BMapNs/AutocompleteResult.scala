package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AutocompleteResult extends js.Object {
  var keyword: java.lang.String
  def getNumPois(): scala.Double
  def getPoi(i: scala.Double): AutocompleteResultPoi
}

