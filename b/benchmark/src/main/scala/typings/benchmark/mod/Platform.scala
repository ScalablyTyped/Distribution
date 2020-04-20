package typings.benchmark.mod

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
    version: String
  ): Platform = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platform]
  }
}

