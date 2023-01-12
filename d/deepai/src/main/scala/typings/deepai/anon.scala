package typings.deepai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: String
    
    var output_url: String
  }
  object Id {
    
    inline def apply(id: String, output_url: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], output_url = output_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOutput_url(value: String): Self = StObject.set(x, "output_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Image extends StObject {
    
    var image: String
  }
  object Image {
    
    inline def apply(image: String): Image = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    }
  }
  
  trait Image1 extends StObject {
    
    var image1: String
    
    var image2: String
  }
  object Image1 {
    
    inline def apply(image1: String, image2: String): Image1 = {
      val __obj = js.Dynamic.literal(image1 = image1.asInstanceOf[js.Any], image2 = image2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image1]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Image1] (val x: Self) extends AnyVal {
      
      inline def setImage1(value: String): Self = StObject.set(x, "image1", value.asInstanceOf[js.Any])
      
      inline def setImage2(value: String): Self = StObject.set(x, "image2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var text: String
  }
  object Text {
    
    inline def apply(text: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
