package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateScriptRequest extends StObject {
  
  /**
    * A list of the edges in the DAG.
    */
  var DagEdges: js.UndefOr[typings.awsSdk.glueMod.DagEdges] = js.native
  
  /**
    * A list of the nodes in the DAG.
    */
  var DagNodes: js.UndefOr[typings.awsSdk.glueMod.DagNodes] = js.native
  
  /**
    * The programming language of the resulting code from the DAG.
    */
  var Language: js.UndefOr[typings.awsSdk.glueMod.Language] = js.native
}
object CreateScriptRequest {
  
  @scala.inline
  def apply(): CreateScriptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateScriptRequest]
  }
  
  @scala.inline
  implicit class CreateScriptRequestMutableBuilder[Self <: CreateScriptRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDagEdges(value: DagEdges): Self = StObject.set(x, "DagEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDagEdgesUndefined: Self = StObject.set(x, "DagEdges", js.undefined)
    
    @scala.inline
    def setDagEdgesVarargs(value: CodeGenEdge*): Self = StObject.set(x, "DagEdges", js.Array(value :_*))
    
    @scala.inline
    def setDagNodes(value: DagNodes): Self = StObject.set(x, "DagNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDagNodesUndefined: Self = StObject.set(x, "DagNodes", js.undefined)
    
    @scala.inline
    def setDagNodesVarargs(value: CodeGenNode*): Self = StObject.set(x, "DagNodes", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: Language): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "Language", js.undefined)
  }
}
