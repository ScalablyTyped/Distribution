package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayersListItem extends StObject {
  
  /**
    * The newest version of the layer.
    */
  var LatestMatchingVersion: js.UndefOr[LayerVersionsListItem] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the function layer.
    */
  var LayerArn: js.UndefOr[typings.awsSdk.lambdaMod.LayerArn] = js.native
  
  /**
    * The name of the layer.
    */
  var LayerName: js.UndefOr[typings.awsSdk.lambdaMod.LayerName] = js.native
}
object LayersListItem {
  
  @scala.inline
  def apply(): LayersListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersListItem]
  }
  
  @scala.inline
  implicit class LayersListItemMutableBuilder[Self <: LayersListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatestMatchingVersion(value: LayerVersionsListItem): Self = StObject.set(x, "LatestMatchingVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestMatchingVersionUndefined: Self = StObject.set(x, "LatestMatchingVersion", js.undefined)
    
    @scala.inline
    def setLayerArn(value: LayerArn): Self = StObject.set(x, "LayerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerArnUndefined: Self = StObject.set(x, "LayerArn", js.undefined)
    
    @scala.inline
    def setLayerName(value: LayerName): Self = StObject.set(x, "LayerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerNameUndefined: Self = StObject.set(x, "LayerName", js.undefined)
  }
}
