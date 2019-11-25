package typings.classDashTransformer.metadataExposeExcludeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeHelpOptions extends js.Object {
  var newObject: js.Any
  var `object`: js.Object
  var property: String
}

object TypeHelpOptions {
  @scala.inline
  def apply(newObject: js.Any, `object`: js.Object, property: String): TypeHelpOptions = {
    val __obj = js.Dynamic.literal(newObject = newObject.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeHelpOptions]
  }
}

