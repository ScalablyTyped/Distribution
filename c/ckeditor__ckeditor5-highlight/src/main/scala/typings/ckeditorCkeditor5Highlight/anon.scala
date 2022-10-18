package typings.ckeditorCkeditor5Highlight

import org.scalablytyped.runtime.Instantiable0
import typings.ckeditorCkeditor5Highlight.ckeditorCkeditor5HighlightStrings.HighlightEditing
import typings.ckeditorCkeditor5Highlight.ckeditorCkeditor5HighlightStrings.HighlightUI
import typings.ckeditorCkeditor5Highlight.srcHighlighteditingMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bluemarker extends StObject {
    
    var `Blue marker`: String
    
    var `Green marker`: String
    
    var `Green pen`: String
    
    var `Pink marker`: String
    
    var `Red pen`: String
    
    var `Yellow marker`: String
  }
  object Bluemarker {
    
    inline def apply(
      `Blue marker`: String,
      `Green marker`: String,
      `Green pen`: String,
      `Pink marker`: String,
      `Red pen`: String,
      `Yellow marker`: String
    ): Bluemarker = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("Blue marker")((`Blue marker`).asInstanceOf[js.Any])
      __obj.updateDynamic("Green marker")((`Green marker`).asInstanceOf[js.Any])
      __obj.updateDynamic("Green pen")((`Green pen`).asInstanceOf[js.Any])
      __obj.updateDynamic("Pink marker")((`Pink marker`).asInstanceOf[js.Any])
      __obj.updateDynamic("Red pen")((`Red pen`).asInstanceOf[js.Any])
      __obj.updateDynamic("Yellow marker")((`Yellow marker`).asInstanceOf[js.Any])
      __obj.asInstanceOf[Bluemarker]
    }
    
    extension [Self <: Bluemarker](x: Self) {
      
      inline def `setBlue marker`(value: String): Self = StObject.set(x, "Blue marker", value.asInstanceOf[js.Any])
      
      inline def `setGreen marker`(value: String): Self = StObject.set(x, "Green marker", value.asInstanceOf[js.Any])
      
      inline def `setGreen pen`(value: String): Self = StObject.set(x, "Green pen", value.asInstanceOf[js.Any])
      
      inline def `setPink marker`(value: String): Self = StObject.set(x, "Pink marker", value.asInstanceOf[js.Any])
      
      inline def `setRed pen`(value: String): Self = StObject.set(x, "Red pen", value.asInstanceOf[js.Any])
      
      inline def `setYellow marker`(value: String): Self = StObject.set(x, "Yellow marker", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofHighlightEditing
    extends StObject
       with Instantiable0[default] {
    
    val pluginName: HighlightEditing = js.native
  }
  
  @js.native
  trait TypeofHighlightUI
    extends StObject
       with Instantiable0[typings.ckeditorCkeditor5Highlight.srcHighlightuiMod.default] {
    
    val pluginName: HighlightUI = js.native
  }
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    inline def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
