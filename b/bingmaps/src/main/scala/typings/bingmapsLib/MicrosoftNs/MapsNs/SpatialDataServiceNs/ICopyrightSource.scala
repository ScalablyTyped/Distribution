package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICopyrightSource extends js.Object {
  /** The copyright string from the source. */
  var Copyright: java.lang.String
  /** An ID identifying the data provider that supplied the data. */
  var SourceID: java.lang.String
  /** The name of the data provider represented by this Source element. */
  var SourceName: java.lang.String
}

object ICopyrightSource {
  @scala.inline
  def apply(Copyright: java.lang.String, SourceID: java.lang.String, SourceName: java.lang.String): ICopyrightSource = {
    val __obj = js.Dynamic.literal(Copyright = Copyright, SourceID = SourceID, SourceName = SourceName)
  
    __obj.asInstanceOf[ICopyrightSource]
  }
}

