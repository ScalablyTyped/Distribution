package typings
package babelDashTraverseLib.babelDashTraverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-traverse", "Scope")
@js.native
class Scope protected () extends js.Object {
  def this(path: NodePath[Node]) = this()
  def this(path: NodePath[Node], parentScope: Scope) = this()
  var bindings: ScalablyTyped.runtime.StringDictionary[Binding] = js.native
  var block: Node = js.native
  var hub: Hub = js.native
  var parent: Scope = js.native
  var parentBlock: Node = js.native
  var path: NodePath[Node] = js.native
  def addGlobal(node: Node): scala.Unit = js.native
  def bindingIdentifierEquals(name: java.lang.String, node: Node): scala.Boolean = js.native
  def buildUndefinedNode(): Node = js.native
  def checkBlockScopedCollisions(local: Node, kind: java.lang.String, name: java.lang.String, id: js.Object): scala.Unit = js.native
  def dump(): scala.Unit = js.native
  /** Generate a unique identifier and add it to the current scope. */
  def generateDeclaredUidIdentifier(): babelDashTypesLib.babelDashTypesMod.Identifier = js.native
  /** Generate a unique identifier and add it to the current scope. */
  def generateDeclaredUidIdentifier(name: java.lang.String): babelDashTypesLib.babelDashTypesMod.Identifier = js.native
  /** Generate a unique `_id1` binding. */
  def generateUid(): java.lang.String = js.native
  /** Generate a unique `_id1` binding. */
  def generateUid(name: java.lang.String): java.lang.String = js.native
  /** Generate a unique identifier. */
  def generateUidIdentifier(): babelDashTypesLib.babelDashTypesMod.Identifier = js.native
  /** Generate a unique identifier. */
  def generateUidIdentifier(name: java.lang.String): babelDashTypesLib.babelDashTypesMod.Identifier = js.native
  /** Generate a unique identifier based on a node. */
  def generateUidIdentifierBasedOnNode(parent: Node): babelDashTypesLib.babelDashTypesMod.Identifier = js.native
  /** Generate a unique identifier based on a node. */
  def generateUidIdentifierBasedOnNode(parent: Node, defaultName: java.lang.String): babelDashTypesLib.babelDashTypesMod.Identifier = js.native
  /** Walks the scope tree and gathers **all** bindings. */
  def getAllBindings(kinds: java.lang.String*): js.Object = js.native
  def getBinding(name: java.lang.String): js.UndefOr[Binding] = js.native
  def getBindingIdentifier(name: java.lang.String): babelDashTypesLib.babelDashTypesMod.Identifier = js.native
  def getBlockParent(): Scope = js.native
  def getData(key: java.lang.String): js.Any = js.native
  def getFunctionParent(): Scope = js.native
  def getOwnBinding(name: java.lang.String): js.UndefOr[Binding] = js.native
  def getOwnBindingIdentifier(name: java.lang.String): babelDashTypesLib.babelDashTypesMod.Identifier = js.native
  def getProgramParent(): Scope = js.native
  def hasBinding(name: java.lang.String): scala.Boolean = js.native
  def hasBinding(name: java.lang.String, noGlobals: scala.Boolean): scala.Boolean = js.native
  def hasGlobal(name: java.lang.String): scala.Boolean = js.native
  def hasOwnBinding(name: java.lang.String): scala.Boolean = js.native
  def hasReference(name: java.lang.String): scala.Boolean = js.native
  def hasUid(name: java.lang.String): scala.Boolean = js.native
  def isPure(node: Node): scala.Boolean = js.native
  def isPure(node: Node, constantsOnly: scala.Boolean): scala.Boolean = js.native
  /**
       * Determine whether evaluating the specific input `node` is a consequenceless reference. ie.
       * evaluating it wont result in potentially arbitrary code from being ran. The following are
       * whitelisted and determined not to cause side effects:
       *
       *  - `this` expressions
       *  - `super` expressions
       *  - Bound identifiers
       */
  def isStatic(node: Node): scala.Boolean = js.native
  /** Possibly generate a memoised identifier if it is not static and has consequences. */
  def maybeGenerateMemoised(node: Node): babelDashTypesLib.babelDashTypesMod.Identifier = js.native
  /** Possibly generate a memoised identifier if it is not static and has consequences. */
  def maybeGenerateMemoised(node: Node, dontPush: scala.Boolean): babelDashTypesLib.babelDashTypesMod.Identifier = js.native
  /** Move a binding of `name` to another `scope`. */
  def moveBindingTo(name: java.lang.String, scope: Scope): scala.Unit = js.native
  def parentHasBinding(name: java.lang.String): scala.Boolean = js.native
  def parentHasBinding(name: java.lang.String, noGlobals: scala.Boolean): scala.Boolean = js.native
  def push(opts: js.Any): scala.Unit = js.native
  def registerBinding(kind: java.lang.String, path: NodePath[Node]): scala.Unit = js.native
  def registerBinding(kind: java.lang.String, path: NodePath[Node], bindingPath: NodePath[Node]): scala.Unit = js.native
  def registerConstantViolation(path: NodePath[Node]): scala.Unit = js.native
  def registerDeclaration(path: NodePath[Node]): scala.Unit = js.native
  def removeBinding(name: java.lang.String): scala.Unit = js.native
  def removeData(key: java.lang.String): scala.Unit = js.native
  def removeOwnBinding(name: java.lang.String): scala.Unit = js.native
  def rename(oldName: java.lang.String): scala.Unit = js.native
  def rename(oldName: java.lang.String, newName: java.lang.String): scala.Unit = js.native
  def rename(oldName: java.lang.String, newName: java.lang.String, block: Node): scala.Unit = js.native
  def setData(key: java.lang.String, `val`: js.Any): js.Any = js.native
  def toArray(node: Node): Node = js.native
  def toArray(node: Node, i: scala.Double): Node = js.native
  def traverse(node: Node): scala.Unit = js.native
  def traverse(node: Node, opts: TraverseOptions[Node]): scala.Unit = js.native
  def traverse(node: Node, opts: TraverseOptions[Node], state: js.Any): scala.Unit = js.native
  def traverse(node: js.Array[Node]): scala.Unit = js.native
  def traverse(node: js.Array[Node], opts: TraverseOptions[Node]): scala.Unit = js.native
  def traverse(node: js.Array[Node], opts: TraverseOptions[Node], state: js.Any): scala.Unit = js.native
  /** Traverse node with current scope and path. */
  def traverse[S](node: Node, opts: TraverseOptions[S], state: S): scala.Unit = js.native
  /** Traverse node with current scope and path. */
  def traverse[S](node: js.Array[Node], opts: TraverseOptions[S], state: S): scala.Unit = js.native
}

