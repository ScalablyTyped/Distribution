package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeGenEdge extends StObject {
  
  /**
    * The ID of the node at which the edge starts.
    */
  var Source: CodeGenIdentifier
  
  /**
    * The ID of the node at which the edge ends.
    */
  var Target: CodeGenIdentifier
  
  /**
    * The target of the edge.
    */
  var TargetParameter: js.UndefOr[CodeGenArgName] = js.undefined
}
object CodeGenEdge {
  
  @scala.inline
  def apply(Source: CodeGenIdentifier, Target: CodeGenIdentifier): CodeGenEdge = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenEdge]
  }
  
  @scala.inline
  implicit class CodeGenEdgeMutableBuilder[Self <: CodeGenEdge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: CodeGenIdentifier): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: CodeGenIdentifier): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetParameter(value: CodeGenArgName): Self = StObject.set(x, "TargetParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetParameterUndefined: Self = StObject.set(x, "TargetParameter", js.undefined)
  }
}
