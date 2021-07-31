package typings.broccoliPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  type MapSeriesIterator[T] = js.Function3[/* item */ T, /* index */ Double, /* array */ js.Array[T], js.Promise[T] | T]
  
  trait PluginOptions extends StObject {
    
    /**
      * A descriptive annotation. Useful for debugging, to tell multiple instances of the same plugin apart.
      */
    var annotation: js.UndefOr[String] = js.undefined
    
    /**
      * The name of this plugin class. Defaults to this.constructor.name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * If true, a cache directory is created automatically and the path is set at cachePath.
      * If false, a cache directory is not created and this.cachePath is undefined. Defaults to true
      */
    var needsCache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the output directory is not automatically emptied between builds.
      */
    var persistentOutput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, a change object will be passed to the build method which contains
      * information about which input has changed since the last build. Defaults to false.
      */
    var trackInputChanges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, memoization will not be applied and the build method will always be called regardless if the inputNodes have changed. Defaults to false.
      */
    var volatile: js.UndefOr[Boolean] = js.undefined
  }
  object PluginOptions {
    
    @scala.inline
    def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit class PluginOptionsMutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotation(value: String): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNeedsCache(value: Boolean): Self = StObject.set(x, "needsCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedsCacheUndefined: Self = StObject.set(x, "needsCache", js.undefined)
      
      @scala.inline
      def setPersistentOutput(value: Boolean): Self = StObject.set(x, "persistentOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentOutputUndefined: Self = StObject.set(x, "persistentOutput", js.undefined)
      
      @scala.inline
      def setTrackInputChanges(value: Boolean): Self = StObject.set(x, "trackInputChanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackInputChangesUndefined: Self = StObject.set(x, "trackInputChanges", js.undefined)
      
      @scala.inline
      def setVolatile(value: Boolean): Self = StObject.set(x, "volatile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolatileUndefined: Self = StObject.set(x, "volatile", js.undefined)
    }
  }
}
