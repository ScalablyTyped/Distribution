package typings.ckeditor4.CKEDITOR.plugins

import typings.ckeditor4.CKEDITOR.dom.element
import typings.ckeditor4.CKEDITOR.fileTools.fileLoader
import typings.ckeditor4.CKEDITOR.plugins.widget.definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagebase {
  
  trait imageWidgetDefinition
    extends StObject
       with definition {
    
    var features: js.Array[String]
    
    @JSName("upcast")
    var upcast_imageWidgetDefinition: String
  }
  object imageWidgetDefinition {
    
    inline def apply(features: js.Array[String], upcast: String): imageWidgetDefinition = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], upcast = upcast.asInstanceOf[js.Any])
      __obj.asInstanceOf[imageWidgetDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: imageWidgetDefinition] (val x: Self) extends AnyVal {
      
      inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setUpcast(value: String): Self = StObject.set(x, "upcast", value.asInstanceOf[js.Any])
    }
  }
  
  trait progressBar
    extends StObject
       with progressReporter {
    
    var bar: element
  }
  object progressBar {
    
    inline def apply(
      aborted: () => Unit,
      bar: element,
      bindLoader: fileLoader => Unit,
      done: () => Unit,
      failed: () => Unit,
      remove: () => Unit,
      updated: Double => Unit,
      wrapper: element
    ): progressBar = {
      val __obj = js.Dynamic.literal(aborted = js.Any.fromFunction0(aborted), bar = bar.asInstanceOf[js.Any], bindLoader = js.Any.fromFunction1(bindLoader), done = js.Any.fromFunction0(done), failed = js.Any.fromFunction0(failed), remove = js.Any.fromFunction0(remove), updated = js.Any.fromFunction1(updated), wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[progressBar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: progressBar] (val x: Self) extends AnyVal {
      
      inline def setBar(value: element): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    }
  }
  
  trait progressReporter extends StObject {
    
    def aborted(): Unit
    
    def bindLoader(loader: fileLoader): Unit
    
    def done(): Unit
    
    def failed(): Unit
    
    def remove(): Unit
    
    def updated(progress: Double): Unit
    
    var wrapper: element
  }
  object progressReporter {
    
    inline def apply(
      aborted: () => Unit,
      bindLoader: fileLoader => Unit,
      done: () => Unit,
      failed: () => Unit,
      remove: () => Unit,
      updated: Double => Unit,
      wrapper: element
    ): progressReporter = {
      val __obj = js.Dynamic.literal(aborted = js.Any.fromFunction0(aborted), bindLoader = js.Any.fromFunction1(bindLoader), done = js.Any.fromFunction0(done), failed = js.Any.fromFunction0(failed), remove = js.Any.fromFunction0(remove), updated = js.Any.fromFunction1(updated), wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[progressReporter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: progressReporter] (val x: Self) extends AnyVal {
      
      inline def setAborted(value: () => Unit): Self = StObject.set(x, "aborted", js.Any.fromFunction0(value))
      
      inline def setBindLoader(value: fileLoader => Unit): Self = StObject.set(x, "bindLoader", js.Any.fromFunction1(value))
      
      inline def setDone(value: () => Unit): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
      
      inline def setFailed(value: () => Unit): Self = StObject.set(x, "failed", js.Any.fromFunction0(value))
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setUpdated(value: Double => Unit): Self = StObject.set(x, "updated", js.Any.fromFunction1(value))
      
      inline def setWrapper(value: element): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
