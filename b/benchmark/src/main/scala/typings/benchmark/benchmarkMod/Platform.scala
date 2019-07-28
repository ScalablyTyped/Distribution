package typings.benchmark.benchmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platform extends js.Object {
  var description: String
  var layout: String
  var manufacturer: String
  var name: String
  var os: String
  var prerelease: String
  var product: String
  var version: String
}

object Platform {
  @scala.inline
  def apply(
    description: String,
    layout: String,
    manufacturer: String,
    name: String,
    os: String,
    prerelease: String,
    product: String,
    toString: () => String,
    version: String
  ): Platform = {
    val __obj = js.Dynamic.literal(description = description, layout = layout, manufacturer = manufacturer, name = name, os = os, prerelease = prerelease, product = product, toString = js.Any.fromFunction0(toString), version = version)
  
    __obj.asInstanceOf[Platform]
  }
}

