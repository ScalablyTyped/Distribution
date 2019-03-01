package typings
package benchmarkLib.benchmarkMod.BenchmarkNs

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
    toString: js.Function0[java.lang.String],
    version: java.lang.String
  ): Platform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("layout")(layout)
    __obj.updateDynamic("manufacturer")(manufacturer)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("os")(os)
    __obj.updateDynamic("prerelease")(prerelease)
    __obj.updateDynamic("product")(product)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Platform]
  }
}

