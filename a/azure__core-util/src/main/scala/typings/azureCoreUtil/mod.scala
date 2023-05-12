package typings.azureCoreUtil

import org.scalablytyped.runtime.StringDictionary
import typings.azureAbortController.typesSrcAbortSignalMod.AbortSignalLike
import typings.azureCoreUtil.azureCoreUtilStrings.base64
import typings.azureCoreUtil.azureCoreUtilStrings.hex
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@azure/core-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeSha256Hash(content: String, encoding: base64 | hex): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSha256Hash")(content.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def computeSha256Hmac(key: String, stringToSign: String, encoding: base64 | hex): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSha256Hmac")(key.asInstanceOf[js.Any], stringToSign.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def createAbortablePromise[T](
    buildPromise: js.Function2[
      /* resolve */ js.Function1[/* value */ T | PromiseLike[T], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAbortablePromise")(buildPromise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def createAbortablePromise[T](
    buildPromise: js.Function2[
      /* resolve */ js.Function1[/* value */ T | PromiseLike[T], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
      Unit
    ],
    options: CreateAbortablePromiseOptions
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbortablePromise")(buildPromise.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def delay(timeInMs: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(timeInMs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def delay(timeInMs: Double, options: DelayOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(timeInMs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getErrorMessage(e: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorMessage")(e.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getRandomIntegerInclusive(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRandomIntegerInclusive")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isDefined[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")().asInstanceOf[/* is T */ Boolean]
  inline def isDefined[T](thing: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def isError(e: Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  @JSImport("@azure/core-util", "isNode")
  @js.native
  val isNode: Boolean = js.native
  
  inline def isObject(input: Any): /* is @azure/core-util.@azure/core-util.UnknownObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(input.asInstanceOf[js.Any]).asInstanceOf[/* is @azure/core-util.@azure/core-util.UnknownObject */ Boolean]
  
  inline def isObjectWithProperties[Thing, PropertyName /* <: String */](thing: Thing, properties: js.Array[PropertyName]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectWithProperties")(thing.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def objectHasProperty[Thing, PropertyName /* <: String */](thing: Thing, property: PropertyName): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("objectHasProperty")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def randomUUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUUID")().asInstanceOf[String]
  
  trait CreateAbortablePromiseOptions extends StObject {
    
    /** An abort error message */
    var abortErrorMsg: js.UndefOr[String] = js.undefined
    
    /** An abort signal */
    var abortSignal: js.UndefOr[AbortSignalLike] = js.undefined
    
    /** A function to be called if the promise was aborted */
    var cleanupBeforeAbort: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object CreateAbortablePromiseOptions {
    
    inline def apply(): CreateAbortablePromiseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateAbortablePromiseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateAbortablePromiseOptions] (val x: Self) extends AnyVal {
      
      inline def setAbortErrorMsg(value: String): Self = StObject.set(x, "abortErrorMsg", value.asInstanceOf[js.Any])
      
      inline def setAbortErrorMsgUndefined: Self = StObject.set(x, "abortErrorMsg", js.undefined)
      
      inline def setAbortSignal(value: AbortSignalLike): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
      
      inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
      
      inline def setCleanupBeforeAbort(value: () => Unit): Self = StObject.set(x, "cleanupBeforeAbort", js.Any.fromFunction0(value))
      
      inline def setCleanupBeforeAbortUndefined: Self = StObject.set(x, "cleanupBeforeAbort", js.undefined)
    }
  }
  
  trait DelayOptions extends StObject {
    
    /**
      * The abort error message associated with containing operation.
      */
    var abortErrorMsg: js.UndefOr[String] = js.undefined
    
    /**
      * The abortSignal associated with containing operation.
      */
    var abortSignal: js.UndefOr[AbortSignalLike] = js.undefined
  }
  object DelayOptions {
    
    inline def apply(): DelayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DelayOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DelayOptions] (val x: Self) extends AnyVal {
      
      inline def setAbortErrorMsg(value: String): Self = StObject.set(x, "abortErrorMsg", value.asInstanceOf[js.Any])
      
      inline def setAbortErrorMsgUndefined: Self = StObject.set(x, "abortErrorMsg", js.undefined)
      
      inline def setAbortSignal(value: AbortSignalLike): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
      
      inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    }
  }
  
  type UnknownObject = StringDictionary[Any]
}
