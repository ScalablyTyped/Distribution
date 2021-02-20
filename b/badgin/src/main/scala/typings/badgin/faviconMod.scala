package typings.badgin

import typings.badgin.anon.PartialOptions
import typings.badgin.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faviconMod {
  
  @JSImport("badgin/build/favicon", "DefaultOptions")
  @js.native
  val DefaultOptions: Options = js.native
  
  @JSImport("badgin/build/favicon", "DefaultValue")
  @js.native
  val DefaultValue: Value = js.native
  
  @JSImport("badgin/build/favicon", "clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSImport("badgin/build/favicon", "isAvailable")
  @js.native
  def isAvailable(): Boolean = js.native
  
  @JSImport("badgin/build/favicon", "set")
  @js.native
  def set(value: Value): Boolean = js.native
  @JSImport("badgin/build/favicon", "set")
  @js.native
  def set(value: Value, options: PartialOptions): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    var backgroundColor: String = js.native
    
    var color: String = js.native
    
    var horizontalMargin: Double = js.native
    
    var horizontalPadding: Double = js.native
    
    var indicator: String = js.native
    
    var radius: Double = js.native
    
    var size: Double = js.native
    
    var verticalMargin: Double = js.native
    
    var verticalPadding: Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      backgroundColor: String,
      color: String,
      horizontalMargin: Double,
      horizontalPadding: Double,
      indicator: String,
      radius: Double,
      size: Double,
      verticalMargin: Double,
      verticalPadding: Double
    ): Options = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], horizontalMargin = horizontalMargin.asInstanceOf[js.Any], horizontalPadding = horizontalPadding.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], verticalMargin = verticalMargin.asInstanceOf[js.Any], verticalPadding = verticalPadding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalMargin(value: Double): Self = StObject.set(x, "horizontalMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalPadding(value: Double): Self = StObject.set(x, "horizontalPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicator(value: String): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalMargin(value: Double): Self = StObject.set(x, "verticalMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalPadding(value: Double): Self = StObject.set(x, "verticalPadding", value.asInstanceOf[js.Any])
    }
  }
}
