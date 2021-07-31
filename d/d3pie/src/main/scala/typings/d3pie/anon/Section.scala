package typings.d3pie.anon

import typings.d3pie.d3pieStrings.inner
import typings.d3pie.d3pieStrings.outer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Section extends StObject {
  
  var label: String
  
  var section: outer | inner
  
  var value: Double
}
object Section {
  
  @scala.inline
  def apply(label: String, section: outer | inner, value: Double): Section = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
  
  @scala.inline
  implicit class SectionMutableBuilder[Self <: Section] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: outer | inner): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
