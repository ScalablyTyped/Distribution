package typings.behavior3.global.b3

import typings.behavior3.anon.Category
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The BaseNode class is used as super class to all nodes in BehaviorJS. It
  * comprises all common variables and methods that a node must have to
  * execute.
  *
  * **IMPORTANT:** Do not inherit from this class, use `Composite`,
  * `Decorator`, `Action` or `Condition`, instead.
  *
  * The attributes are specially designed to serialization of the node in a
  * JSON format. In special, the `parameters` attribute can be set into the
  * visual editor (thus, in the JSON file), and it will be used as parameter
  * on the node initialization at `BehaviorTree.load`.
  *
  * BaseNode also provide 5 callback methods, which the node implementations
  * can override. They are `enter`, `open`, `tick`, `close` and `exit`. See
  * their documentation to know more. These callbacks are called inside the
  * `_execute` method, which is called in the tree traversal.
  *
  */
@JSGlobal("b3.BaseNode")
@js.native
/**
  * Initialization method.
  */
class BaseNode ()
  extends typings.behavior3.b3.BaseNode {
  def this(hasCategoryNameTitleDescriptionProperties: Category) = this()
}
