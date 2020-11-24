package typings.behavior3.global.b3

import typings.behavior3.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Action is the base class for all action nodes. Thus, if you want to create
  * new custom action nodes, you need to inherit from this class. For example,
  * take a look at the Runner action:
  *
  *     class Runner extends b3.Action {
  *       constructor(){
  *         super({name: 'Runner'});
  *       }
  *       tick(tick) {
  *         return b3.RUNNING;
  *       }
  *     };
  *
  */
@JSGlobal("b3.Action")
@js.native
/**
  * Creates an instance of Action.
  */
class Action ()
  extends typings.behavior3.b3.BaseNode {
  def this(hasNameTitleProperties: Name) = this()
}
