package typings.ckeditor4.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor4.CKEDITOR.dom.element
import typings.ckeditor4.CKEDITOR.dom.elementPath
import typings.ckeditor4.CKEDITOR.dom.range
import typings.ckeditor4.CKEDITOR.filter.allowedContentRules
import typings.ckeditor4.CKEDITOR.style.definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait style extends StObject {
  
  var alwaysRemoveElement: Boolean = js.native
  
  @JSName("apply")
  def apply(editor: editor): Unit = js.native
  
  def applyToObject(element: element, editor: editor): Unit = js.native
  
  def applyToRange(range: range, editor: editor): Unit = js.native
  
  def buildPreview(): String = js.native
  def buildPreview(label: String): String = js.native
  
  def checkActive(elementPath: elementPath, editor: editor): Boolean = js.native
  
  def checkApplicable(elementPath: elementPath, editor: editor): Boolean = js.native
  def checkApplicable(elementPath: elementPath, editor: editor, filter: filter): Boolean = js.native
  
  def checkElementMatch(element: element, fullMatch: Boolean, editor: editor): Boolean = js.native
  
  def checkElementRemovable(element: element, fullMatch: Boolean, editor: editor): Boolean = js.native
  
  def getDefinition(): definition = js.native
  
  var includeReadonly: Boolean = js.native
  
  def remove(editor: editor): Unit = js.native
  
  def removeFromRange(range: range, editor: editor): Unit = js.native
  
  def toAllowedContentRules(): allowedContentRules = js.native
  def toAllowedContentRules(editor: editor): allowedContentRules = js.native
}
object style {
  
  trait customHandler extends StObject {
    
    var assignedTo: js.UndefOr[Double] = js.undefined
    
    var setup: js.UndefOr[js.Function1[/* style */ definition, Unit]] = js.undefined
    
    var `type`: String | Double
  }
  object customHandler {
    
    inline def apply(`type`: String | Double): customHandler = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[customHandler]
    }
    
    extension [Self <: customHandler](x: Self) {
      
      inline def setAssignedTo(value: Double): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
      
      inline def setAssignedToUndefined: Self = StObject.set(x, "assignedTo", js.undefined)
      
      inline def setSetup(value: /* style */ definition => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
      
      inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      inline def setType(value: String | Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  object customHandlers {
    
    @js.native
    trait widget
      extends StObject
         with style {
      
      def checkElement(element: element): Boolean = js.native
      
      def getClassesArray(): js.Array[String] = js.native
      
      def getDefintion(): definition = js.native
      
      var group: js.Array[Any] = js.native
      
      def removeStylesFromSameGroup(editor: editor): Boolean = js.native
      
      var widget: String = js.native
    }
  }
  
  trait definition extends StObject {
    
    var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var element: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var styles: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var `type`: js.UndefOr[String | Double] = js.undefined
  }
  object definition {
    
    inline def apply(): definition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[definition]
    }
    
    extension [Self <: definition](x: Self) {
      
      inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStyles(value: StringDictionary[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setType(value: String | Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
