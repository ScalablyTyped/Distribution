package typings.baseui

import typings.baseui.treeViewTypesMod.TreeNodeData
import typings.baseui.treeViewTypesMod.TreeNodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeViewUtilsMod {
  
  @JSImport("baseui/tree-view/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultGetId(node: TreeNodeData[Any]): TreeNodeId = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetId")(node.asInstanceOf[js.Any]).asInstanceOf[TreeNodeId]
  
  inline def getCharMatchId(
    nodes: js.Array[TreeNodeData[Any]],
    nodeId: TreeNodeId,
    chars: String,
    closestOmmer: Null,
    getId: js.Function1[/* a */ TreeNodeData[Any], TreeNodeId]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getCharMatchId")(nodes.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], chars.asInstanceOf[js.Any], closestOmmer.asInstanceOf[js.Any], getId.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getCharMatchId(
    nodes: js.Array[TreeNodeData[Any]],
    nodeId: TreeNodeId,
    chars: String,
    closestOmmer: TreeNodeId,
    getId: js.Function1[/* a */ TreeNodeData[Any], TreeNodeId]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getCharMatchId")(nodes.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], chars.asInstanceOf[js.Any], closestOmmer.asInstanceOf[js.Any], getId.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getEndId(nodes: js.Array[TreeNodeData[Any]], getId: js.Function1[/* a */ TreeNodeData[Any], TreeNodeId]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndId")(nodes.asInstanceOf[js.Any], getId.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getExpandableSiblings(
    nodes: js.Array[TreeNodeData[Any]],
    nodeId: TreeNodeId,
    getId: js.Function1[/* a */ TreeNodeData[Any], TreeNodeId]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getExpandableSiblings")(nodes.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], getId.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getFirstChildId(
    nodes: js.Array[TreeNodeData[Any]],
    nodeId: TreeNodeId,
    getId: js.Function1[/* a */ TreeNodeData[Any], TreeNodeId]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstChildId")(nodes.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], getId.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getNextId(
    nodes: js.Array[TreeNodeData[Any]],
    nodeId: TreeNodeId,
    closestOmmer: Null,
    getId: js.Function1[/* a */ TreeNodeData[Any], TreeNodeId]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextId")(nodes.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], closestOmmer.asInstanceOf[js.Any], getId.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getNextId(
    nodes: js.Array[TreeNodeData[Any]],
    nodeId: TreeNodeId,
    closestOmmer: TreeNodeId,
    getId: js.Function1[/* a */ TreeNodeData[Any], TreeNodeId]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextId")(nodes.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], closestOmmer.asInstanceOf[js.Any], getId.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getParentId(
    nodes: js.Array[TreeNodeData[Any]],
    nodeId: TreeNodeId,
    parentId: Null,
    getId: js.Function1[/* a */ TreeNodeData[Any], TreeNodeId]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getParentId")(nodes.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], getId.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getParentId(
    nodes: js.Array[TreeNodeData[Any]],
    nodeId: TreeNodeId,
    parentId: TreeNodeId,
    getId: js.Function1[/* a */ TreeNodeData[Any], TreeNodeId]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getParentId")(nodes.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], getId.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getPrevId(
    nodes: js.Array[TreeNodeData[Any]],
    nodeId: TreeNodeId,
    parentId: Null,
    getId: js.Function1[/* a */ TreeNodeData[Any], TreeNodeId]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPrevId")(nodes.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], getId.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPrevId(
    nodes: js.Array[TreeNodeData[Any]],
    nodeId: TreeNodeId,
    parentId: TreeNodeId,
    getId: js.Function1[/* a */ TreeNodeData[Any], TreeNodeId]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPrevId")(nodes.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], getId.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def matchString(
    nodes: js.Array[TreeNodeData[Any]],
    nodeId: TreeNodeId,
    chars: String,
    closestOmmer: Null,
    getId: js.Function1[/* a */ TreeNodeData[Any], TreeNodeId],
    matchPrefix: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("matchString")(nodes.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], chars.asInstanceOf[js.Any], closestOmmer.asInstanceOf[js.Any], getId.asInstanceOf[js.Any], matchPrefix.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def matchString(
    nodes: js.Array[TreeNodeData[Any]],
    nodeId: TreeNodeId,
    chars: String,
    closestOmmer: TreeNodeId,
    getId: js.Function1[/* a */ TreeNodeData[Any], TreeNodeId],
    matchPrefix: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("matchString")(nodes.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], chars.asInstanceOf[js.Any], closestOmmer.asInstanceOf[js.Any], getId.asInstanceOf[js.Any], matchPrefix.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def toggleIsExpanded(arr: js.Array[TreeNodeData[Any]], toggledNode: TreeNodeData[Any]): js.Array[TreeNodeData[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleIsExpanded")(arr.asInstanceOf[js.Any], toggledNode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreeNodeData[Any]]]
  inline def toggleIsExpanded(
    arr: js.Array[TreeNodeData[Any]],
    toggledNode: TreeNodeData[Any],
    getId: js.Function1[/* node */ TreeNodeData[Any], TreeNodeId]
  ): js.Array[TreeNodeData[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleIsExpanded")(arr.asInstanceOf[js.Any], toggledNode.asInstanceOf[js.Any], getId.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreeNodeData[Any]]]
}
