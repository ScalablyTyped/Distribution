package typings.d3pie.anon

import typings.d3pie.d3pie.ID3PieTextOptions
import typings.d3pie.d3pieStrings.`pie-center`
import typings.d3pie.d3pieStrings.`top-center`
import typings.d3pie.d3pieStrings.`top-left`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  var location: js.UndefOr[`top-center` | `top-left` | `pie-center`] = js.undefined
  
  var subtitle: js.UndefOr[ID3PieTextOptions] = js.undefined
  
  var title: js.UndefOr[ID3PieTextOptions] = js.undefined
  
  var titleSubtitlePadding: js.UndefOr[Double] = js.undefined
}
object Location {
  
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: `top-center` | `top-left` | `pie-center`): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setSubtitle(value: ID3PieTextOptions): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: ID3PieTextOptions): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleSubtitlePadding(value: Double): Self = StObject.set(x, "titleSubtitlePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleSubtitlePaddingUndefined: Self = StObject.set(x, "titleSubtitlePadding", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
