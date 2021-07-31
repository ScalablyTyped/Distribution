package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAliasResult extends StObject {
  
  /**
    * The alias for the directory.
    */
  var Alias: js.UndefOr[AliasName] = js.undefined
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.undefined
}
object CreateAliasResult {
  
  @scala.inline
  def apply(): CreateAliasResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAliasResult]
  }
  
  @scala.inline
  implicit class CreateAliasResultMutableBuilder[Self <: CreateAliasResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: AliasName): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
  }
}
