package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 位置-----查看位置
trait OpenLocationOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 地址的详细说明 */
  var address: js.UndefOr[String] = js.undefined
  
  /** 纬度，范围为-90~90，负数表示南纬 */
  var latitude: Double
  
  /** 经度，范围为-180~180，负数表示西经 */
  var longitude: Double
  
  /** 位置名 */
  var name: js.UndefOr[String] = js.undefined
  
  /** 缩放比例，范围1~28，默认为28 */
  var scale: js.UndefOr[Double] = js.undefined
}
object OpenLocationOptions {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double): OpenLocationOptions = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenLocationOptions]
  }
  
  @scala.inline
  implicit class OpenLocationOptionsMutableBuilder[Self <: OpenLocationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
