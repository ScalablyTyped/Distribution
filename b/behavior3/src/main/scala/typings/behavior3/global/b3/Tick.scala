package typings.behavior3.global.b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A new Tick object is instantiated every tick by BehaviorTree. It is passed
  * as parameter to the nodes through the tree during the traversal.
  *
  * The role of the Tick class is to store the instances of tree, debug,
  * target and blackboard. So, all nodes can access these informations.
  *
  * For internal uses, the Tick also is useful to store the open node after
  * the tick signal, in order to let `BehaviorTree` to keep track and close
  * them when necessary.
  *
  * This class also makes a bridge between nodes and the debug, passing the
  * node state to the debug if the last is provided.
  *
  */
@JSGlobal("b3.Tick")
@js.native
/**
  * Initialization method.
  */
class Tick ()
  extends typings.behavior3.b3.Tick

