package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockerDeclaration extends StObject {
  
  /**
    * Reserved for future use.
    */
  var name: BlockerName = js.native
  
  /**
    * Reserved for future use.
    */
  var `type`: BlockerType = js.native
}
object BlockerDeclaration {
  
  @scala.inline
  def apply(name: BlockerName, `type`: BlockerType): BlockerDeclaration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockerDeclaration]
  }
  
  @scala.inline
  implicit class BlockerDeclarationMutableBuilder[Self <: BlockerDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: BlockerName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: BlockerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
