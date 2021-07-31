package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateFileSystemAliasesResponse extends StObject {
  
  /**
    * An array of one or more DNS aliases that Amazon FSx is attempting to disassociate from the file system.
    */
  var Aliases: js.UndefOr[typings.awsSdk.fsxMod.Aliases] = js.undefined
}
object DisassociateFileSystemAliasesResponse {
  
  @scala.inline
  def apply(): DisassociateFileSystemAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateFileSystemAliasesResponse]
  }
  
  @scala.inline
  implicit class DisassociateFileSystemAliasesResponseMutableBuilder[Self <: DisassociateFileSystemAliasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: Aliases): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: Alias*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
  }
}
