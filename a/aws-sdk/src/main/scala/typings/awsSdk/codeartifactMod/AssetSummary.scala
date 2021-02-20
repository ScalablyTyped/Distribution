package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetSummary extends StObject {
  
  /**
    *  The hashes of the asset. 
    */
  var hashes: js.UndefOr[AssetHashes] = js.native
  
  /**
    *  The name of the asset. 
    */
  var name: AssetName = js.native
  
  /**
    *  The size of the asset. 
    */
  var size: js.UndefOr[LongOptional] = js.native
}
object AssetSummary {
  
  @scala.inline
  def apply(name: AssetName): AssetSummary = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetSummary]
  }
  
  @scala.inline
  implicit class AssetSummaryMutableBuilder[Self <: AssetSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashes(value: AssetHashes): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
    
    @scala.inline
    def setName(value: AssetName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: LongOptional): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
