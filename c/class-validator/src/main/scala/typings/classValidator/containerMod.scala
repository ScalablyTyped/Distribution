package typings.classValidator

import typings.classValidator.anon.Get
import typings.classValidator.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod {
  
  @JSImport("class-validator/types/container", "getFromContainer")
  @js.native
  def getFromContainer[T](someClass: js.Function): T = js.native
  @JSImport("class-validator/types/container", "getFromContainer")
  @js.native
  def getFromContainer[T](someClass: Instantiable[T]): T = js.native
  
  @JSImport("class-validator/types/container", "useContainer")
  @js.native
  def useContainer(iocContainer: Get): Unit = js.native
  @JSImport("class-validator/types/container", "useContainer")
  @js.native
  def useContainer(iocContainer: Get, options: UseContainerOptions): Unit = js.native
  
  @js.native
  trait UseContainerOptions extends StObject {
    
    /**
      * If set to true, then default container will be used in the case if given container haven't returned anything.
      */
    var fallback: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to true, then default container will be used in the case if given container thrown an exception.
      */
    var fallbackOnErrors: js.UndefOr[Boolean] = js.native
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
