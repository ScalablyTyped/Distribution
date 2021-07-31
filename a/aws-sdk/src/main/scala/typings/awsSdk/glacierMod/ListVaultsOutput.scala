package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVaultsOutput extends StObject {
  
  /**
    * The vault ARN at which to continue pagination of the results. You use the marker in another List Vaults request to obtain more vaults in the list.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * List of vaults.
    */
  var VaultList: js.UndefOr[typings.awsSdk.glacierMod.VaultList] = js.undefined
}
object ListVaultsOutput {
  
  @scala.inline
  def apply(): ListVaultsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVaultsOutput]
  }
  
  @scala.inline
  implicit class ListVaultsOutputMutableBuilder[Self <: ListVaultsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setVaultList(value: VaultList): Self = StObject.set(x, "VaultList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultListUndefined: Self = StObject.set(x, "VaultList", js.undefined)
    
    @scala.inline
    def setVaultListVarargs(value: DescribeVaultOutput*): Self = StObject.set(x, "VaultList", js.Array(value :_*))
  }
}
