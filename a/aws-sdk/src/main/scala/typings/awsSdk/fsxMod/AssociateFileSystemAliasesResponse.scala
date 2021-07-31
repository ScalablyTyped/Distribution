package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateFileSystemAliasesResponse extends StObject {
  
  /**
    * An array of the DNS aliases that Amazon FSx is associating with the file system.
    */
  var Aliases: js.UndefOr[typings.awsSdk.fsxMod.Aliases] = js.undefined
}
object AssociateFileSystemAliasesResponse {
  
  @scala.inline
  def apply(): AssociateFileSystemAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateFileSystemAliasesResponse]
  }
  
  @scala.inline
  implicit class AssociateFileSystemAliasesResponseMutableBuilder[Self <: AssociateFileSystemAliasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: Aliases): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: Alias*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
  }
}
