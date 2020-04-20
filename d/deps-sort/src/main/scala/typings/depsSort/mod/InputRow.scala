package typings.depsSort.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input objects are file objects in the module-deps shape. They must at least have these properties:
  */
trait InputRow extends js.Object {
  /**
    * dependencies for this file, mapping strings as used in require() to row IDs
    */
  var deps: js.Array[String]
  /**
    * a unique identifier for the file
    */
  var id: String
  /**
    * the file contents
    */
  var source: String
}

object InputRow {
  @scala.inline
  def apply(deps: js.Array[String], id: String, source: String): InputRow = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputRow]
  }
}

