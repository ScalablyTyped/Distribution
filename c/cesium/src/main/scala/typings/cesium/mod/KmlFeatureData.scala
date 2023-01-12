package typings.cesium.mod

import typings.cesium.mod.KmlFeatureData.Author
import typings.cesium.mod.KmlFeatureData.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "KmlFeatureData")
@js.native
open class KmlFeatureData () extends StObject {
  
  /**
    * Gets the unstructured address field.
    */
  var address: String = js.native
  
  /**
    * Gets the atom syndication format author field.
    */
  var author: Author = js.native
  
  /**
    * Gets the extended data, parsed into a JSON object.
    * Currently only the <code>Data</code> property is supported.
    * <code>SchemaData</code> and custom data are ignored.
    */
  var extendedData: String = js.native
  
  /**
    * Gets the link.
    */
  var link: Link = js.native
  
  /**
    * Gets the phone number.
    */
  var phoneNumber: String = js.native
  
  /**
    * Gets the snippet.
    */
  var snippet: String = js.native
}
object KmlFeatureData {
  
  /**
    * @property name - Gets the name.
    * @property uri - Gets the URI.
    * @property age - Gets the email.
    */
  trait Author extends StObject {
    
    var age: Double
    
    var name: String
    
    var uri: String
  }
  object Author {
    
    inline def apply(age: Double, name: String, uri: String): Author = {
      val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Author]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Author] (val x: Self) extends AnyVal {
      
      inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @property href - Gets the href.
    * @property hreflang - Gets the language of the linked resource.
    * @property rel - Gets the link relation.
    * @property type - Gets the link type.
    * @property title - Gets the link title.
    * @property length - Gets the link length.
    */
  trait Link extends StObject {
    
    var href: String
    
    var hreflang: String
    
    var length: String
    
    var rel: String
    
    var title: String
    
    var `type`: String
  }
  object Link {
    
    inline def apply(href: String, hreflang: String, length: String, rel: String, title: String, `type`: String): Link = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], hreflang = hreflang.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHreflang(value: String): Self = StObject.set(x, "hreflang", value.asInstanceOf[js.Any])
      
      inline def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
