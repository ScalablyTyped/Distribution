package typings
package benchmarkLib.benchmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platform extends js.Object {
  var description: java.lang.String
  var layout: java.lang.String
  var manufacturer: java.lang.String
  var name: java.lang.String
  var os: java.lang.String
  var prerelease: java.lang.String
  var product: java.lang.String
  var version: java.lang.String
}

object Platform {
  @scala.inline
  def apply(
    description: java.lang.String,
    layout: java.lang.String,
    manufacturer: java.lang.String,
    name: java.lang.String,
    os: java.lang.String,
    prerelease: java.lang.String,
    product: java.lang.String,
    toString: () => java.lang.String,
    version: java.lang.String
  ): Platform = {
    val __obj = js.Dynamic.literal(description = description, layout = layout, manufacturer = manufacturer, name = name, os = os, prerelease = prerelease, product = product, toString = js.Any.fromFunction0(toString), version = version)
  
    __obj.asInstanceOf[Platform]
  }
}

