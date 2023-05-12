package typings.cucumberCucumber

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberCucumber.libRuntimeAttachmentManagerMod.ICreateAttachment
import typings.cucumberCucumber.libRuntimeAttachmentManagerMod.ICreateLog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSupportCodeLibraryBuilderWorldMod {
  
  @JSImport("@cucumber/cucumber/lib/support_code_library_builder/world", JSImport.Default)
  @js.native
  open class default[ParametersType] protected ()
    extends StObject
       with World[ParametersType] {
    def this(param0: IWorldOptions[ParametersType]) = this()
    
    /* CompleteClass */
    override val attach: ICreateAttachment = js.native
    
    /* CompleteClass */
    override def log(text: String): Unit = js.native
    
    /* CompleteClass */
    override val parameters: ParametersType = js.native
  }
  
  trait IWorld[ParametersType]
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    val attach: ICreateAttachment
    
    def log(text: String): Unit
    
    val parameters: ParametersType
  }
  object IWorld {
    
    inline def apply[ParametersType](attach: ICreateAttachment, log: String => Unit, parameters: ParametersType): IWorld[ParametersType] = {
      val __obj = js.Dynamic.literal(attach = attach.asInstanceOf[js.Any], log = js.Any.fromFunction1(log), parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWorld[ParametersType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWorld[?], ParametersType] (val x: Self & IWorld[ParametersType]) extends AnyVal {
      
      inline def setAttach(value: ICreateAttachment): Self = StObject.set(x, "attach", value.asInstanceOf[js.Any])
      
      inline def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setParameters(value: ParametersType): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWorldOptions[ParametersType] extends StObject {
    
    var attach: ICreateAttachment
    
    def log(text: String): Unit
    @JSName("log")
    var log_Original: ICreateLog
    
    var parameters: ParametersType
  }
  object IWorldOptions {
    
    inline def apply[ParametersType](attach: ICreateAttachment, log: /* text */ String => Unit, parameters: ParametersType): IWorldOptions[ParametersType] = {
      val __obj = js.Dynamic.literal(attach = attach.asInstanceOf[js.Any], log = js.Any.fromFunction1(log), parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWorldOptions[ParametersType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWorldOptions[?], ParametersType] (val x: Self & IWorldOptions[ParametersType]) extends AnyVal {
      
      inline def setAttach(value: ICreateAttachment): Self = StObject.set(x, "attach", value.asInstanceOf[js.Any])
      
      inline def setLog(value: /* text */ String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setParameters(value: ParametersType): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    }
  }
  
  trait World[ParametersType]
    extends StObject
       with IWorld[ParametersType]
  object World {
    
    inline def apply[ParametersType](attach: ICreateAttachment, log: String => Unit, parameters: ParametersType): World[ParametersType] = {
      val __obj = js.Dynamic.literal(attach = attach.asInstanceOf[js.Any], log = js.Any.fromFunction1(log), parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[World[ParametersType]]
    }
  }
}
