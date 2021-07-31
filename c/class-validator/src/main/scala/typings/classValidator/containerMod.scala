package typings.classValidator

import typings.classValidator.anon.Get
import typings.classValidator.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod {
  
  @JSImport("class-validator/types/container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getFromContainer[T](someClass: js.Function): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getFromContainer")(someClass.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def getFromContainer[T](someClass: Instantiable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getFromContainer")(someClass.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def useContainer(iocContainer: Get): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useContainer")(iocContainer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def useContainer(iocContainer: Get, options: UseContainerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useContainer")(iocContainer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait UseContainerOptions extends StObject {
    
    /**
      * If set to true, then default container will be used in the case if given container haven't returned anything.
      */
    var fallback: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true, then default container will be used in the case if given container thrown an exception.
      */
    var fallbackOnErrors: js.UndefOr[Boolean] = js.undefined
  }
  object UseContainerOptions {
    
    @scala.inline
    def apply(): UseContainerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseContainerOptions]
    }
    
    @scala.inline
    implicit class UseContainerOptionsMutableBuilder[Self <: UseContainerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackOnErrors(value: Boolean): Self = StObject.set(x, "fallbackOnErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackOnErrorsUndefined: Self = StObject.set(x, "fallbackOnErrors", js.undefined)
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
}
