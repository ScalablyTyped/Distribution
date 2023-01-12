package typings.cordovaPluginCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ALLMEDIA extends StObject {
    
    var ALLMEDIA: Double
    
    var PICTURE: Double
    
    var VIDEO: Double
  }
  object ALLMEDIA {
    
    inline def apply(ALLMEDIA: Double, PICTURE: Double, VIDEO: Double): ALLMEDIA = {
      val __obj = js.Dynamic.literal(ALLMEDIA = ALLMEDIA.asInstanceOf[js.Any], PICTURE = PICTURE.asInstanceOf[js.Any], VIDEO = VIDEO.asInstanceOf[js.Any])
      __obj.asInstanceOf[ALLMEDIA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ALLMEDIA] (val x: Self) extends AnyVal {
      
      inline def setALLMEDIA(value: Double): Self = StObject.set(x, "ALLMEDIA", value.asInstanceOf[js.Any])
      
      inline def setPICTURE(value: Double): Self = StObject.set(x, "PICTURE", value.asInstanceOf[js.Any])
      
      inline def setVIDEO(value: Double): Self = StObject.set(x, "VIDEO", value.asInstanceOf[js.Any])
    }
  }
  
  trait ARROWANY extends StObject {
    
    var ARROW_ANY: Double
    
    var ARROW_DOWN: Double
    
    var ARROW_LEFT: Double
    
    var ARROW_RIGHT: Double
    
    var ARROW_UP: Double
  }
  object ARROWANY {
    
    inline def apply(ARROW_ANY: Double, ARROW_DOWN: Double, ARROW_LEFT: Double, ARROW_RIGHT: Double, ARROW_UP: Double): ARROWANY = {
      val __obj = js.Dynamic.literal(ARROW_ANY = ARROW_ANY.asInstanceOf[js.Any], ARROW_DOWN = ARROW_DOWN.asInstanceOf[js.Any], ARROW_LEFT = ARROW_LEFT.asInstanceOf[js.Any], ARROW_RIGHT = ARROW_RIGHT.asInstanceOf[js.Any], ARROW_UP = ARROW_UP.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARROWANY]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ARROWANY] (val x: Self) extends AnyVal {
      
      inline def setARROW_ANY(value: Double): Self = StObject.set(x, "ARROW_ANY", value.asInstanceOf[js.Any])
      
      inline def setARROW_DOWN(value: Double): Self = StObject.set(x, "ARROW_DOWN", value.asInstanceOf[js.Any])
      
      inline def setARROW_LEFT(value: Double): Self = StObject.set(x, "ARROW_LEFT", value.asInstanceOf[js.Any])
      
      inline def setARROW_RIGHT(value: Double): Self = StObject.set(x, "ARROW_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setARROW_UP(value: Double): Self = StObject.set(x, "ARROW_UP", value.asInstanceOf[js.Any])
    }
  }
  
  trait BACK extends StObject {
    
    var BACK: Double
    
    var FRONT: Double
  }
  object BACK {
    
    inline def apply(BACK: Double, FRONT: Double): BACK = {
      val __obj = js.Dynamic.literal(BACK = BACK.asInstanceOf[js.Any], FRONT = FRONT.asInstanceOf[js.Any])
      __obj.asInstanceOf[BACK]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BACK] (val x: Self) extends AnyVal {
      
      inline def setBACK(value: Double): Self = StObject.set(x, "BACK", value.asInstanceOf[js.Any])
      
      inline def setFRONT(value: Double): Self = StObject.set(x, "FRONT", value.asInstanceOf[js.Any])
    }
  }
  
  trait CAMERA extends StObject {
    
    var CAMERA: Double
    
    var PHOTOLIBRARY: Double
    
    var SAVEDPHOTOALBUM: Double
  }
  object CAMERA {
    
    inline def apply(CAMERA: Double, PHOTOLIBRARY: Double, SAVEDPHOTOALBUM: Double): CAMERA = {
      val __obj = js.Dynamic.literal(CAMERA = CAMERA.asInstanceOf[js.Any], PHOTOLIBRARY = PHOTOLIBRARY.asInstanceOf[js.Any], SAVEDPHOTOALBUM = SAVEDPHOTOALBUM.asInstanceOf[js.Any])
      __obj.asInstanceOf[CAMERA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CAMERA] (val x: Self) extends AnyVal {
      
      inline def setCAMERA(value: Double): Self = StObject.set(x, "CAMERA", value.asInstanceOf[js.Any])
      
      inline def setPHOTOLIBRARY(value: Double): Self = StObject.set(x, "PHOTOLIBRARY", value.asInstanceOf[js.Any])
      
      inline def setSAVEDPHOTOALBUM(value: Double): Self = StObject.set(x, "SAVEDPHOTOALBUM", value.asInstanceOf[js.Any])
    }
  }
  
  trait DATAURL extends StObject {
    
    var DATA_URL: Double
    
    var FILE_URI: Double
  }
  object DATAURL {
    
    inline def apply(DATA_URL: Double, FILE_URI: Double): DATAURL = {
      val __obj = js.Dynamic.literal(DATA_URL = DATA_URL.asInstanceOf[js.Any], FILE_URI = FILE_URI.asInstanceOf[js.Any])
      __obj.asInstanceOf[DATAURL]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DATAURL] (val x: Self) extends AnyVal {
      
      inline def setDATA_URL(value: Double): Self = StObject.set(x, "DATA_URL", value.asInstanceOf[js.Any])
      
      inline def setFILE_URI(value: Double): Self = StObject.set(x, "FILE_URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait JPEG extends StObject {
    
    var JPEG: Double
    
    var PNG: Double
  }
  object JPEG {
    
    inline def apply(JPEG: Double, PNG: Double): JPEG = {
      val __obj = js.Dynamic.literal(JPEG = JPEG.asInstanceOf[js.Any], PNG = PNG.asInstanceOf[js.Any])
      __obj.asInstanceOf[JPEG]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JPEG] (val x: Self) extends AnyVal {
      
      inline def setJPEG(value: Double): Self = StObject.set(x, "JPEG", value.asInstanceOf[js.Any])
      
      inline def setPNG(value: Double): Self = StObject.set(x, "PNG", value.asInstanceOf[js.Any])
    }
  }
}
