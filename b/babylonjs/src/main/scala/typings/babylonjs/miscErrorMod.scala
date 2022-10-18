package typings.babylonjs

import typings.babylonjs.babylonjsInts.`0`
import typings.babylonjs.babylonjsInts.`1000`
import typings.babylonjs.babylonjsInts.`2000`
import typings.babylonjs.babylonjsInts.`3000`
import typings.babylonjs.babylonjsInts.`4000`
import typings.babylonjs.babylonjsInts.`4001`
import typings.babylonjs.babylonjsInts.`4002`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscErrorMod {
  
  /* note: abstract class */ @JSImport("babylonjs/Misc/error", "BaseError")
  @js.native
  open class BaseError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object BaseError {
    
    @JSImport("babylonjs/Misc/error", "BaseError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _setPrototypeOf(o: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_setPrototypeOf")(o.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def _setPrototypeOf(o: Any, proto: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_setPrototypeOf")(o.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  object ErrorCodes {
    
    /** Unexpected magic number found in GLTF file header. */
    @JSImport("babylonjs/Misc/error", "ErrorCodes.GLTFLoaderUnexpectedMagicError")
    @js.native
    val GLTFLoaderUnexpectedMagicError: `2000` = js.native
    
    /** Load file error */
    @JSImport("babylonjs/Misc/error", "ErrorCodes.LoadFileError")
    @js.native
    val LoadFileError: `4000` = js.native
    
    /** Invalid or empty mesh vertex positions. */
    @JSImport("babylonjs/Misc/error", "ErrorCodes.MeshInvalidPositionsError")
    @js.native
    val MeshInvalidPositionsError: `0` = js.native
    
    /** Read file error */
    @JSImport("babylonjs/Misc/error", "ErrorCodes.ReadFileError")
    @js.native
    val ReadFileError: `4002` = js.native
    
    /** Request file error */
    @JSImport("babylonjs/Misc/error", "ErrorCodes.RequestFileError")
    @js.native
    val RequestFileError: `4001` = js.native
    
    /** SceneLoader generic error code. Ideally wraps the inner exception. */
    @JSImport("babylonjs/Misc/error", "ErrorCodes.SceneLoaderError")
    @js.native
    val SceneLoaderError: `3000` = js.native
    
    /** Unsupported texture found. */
    @JSImport("babylonjs/Misc/error", "ErrorCodes.UnsupportedTextureError")
    @js.native
    val UnsupportedTextureError: `1000` = js.native
  }
  
  @JSImport("babylonjs/Misc/error", "RuntimeError")
  @js.native
  open class RuntimeError protected () extends BaseError {
    /**
      * Creates a new RuntimeError
      * @param message defines the message of the error
      * @param errorCode the error code
      * @param innerError the error that caused the outer error
      */
    def this(message: String, errorCode: ErrorCodesType) = this()
    def this(message: String, errorCode: ErrorCodesType, innerError: js.Error) = this()
    
    /**
      * The error code
      */
    var errorCode: ErrorCodesType = js.native
    
    /**
      * The error that caused this outer error
      */
    var innerError: js.UndefOr[js.Error] = js.native
  }
  
  /* Inlined { readonly MeshInvalidPositionsError :0,  readonly UnsupportedTextureError :1000,  readonly GLTFLoaderUnexpectedMagicError :2000,  readonly SceneLoaderError :3000,  readonly LoadFileError :4000,  readonly RequestFileError :4001,  readonly ReadFileError :4002}[keyof { readonly MeshInvalidPositionsError :0,  readonly UnsupportedTextureError :1000,  readonly GLTFLoaderUnexpectedMagicError :2000,  readonly SceneLoaderError :3000,  readonly LoadFileError :4000,  readonly RequestFileError :4001,  readonly ReadFileError :4002}] */
  /* Rewritten from type alias, can be one of: 
    - typings.babylonjs.babylonjsInts.`3000`
    - typings.babylonjs.babylonjsInts.`4000`
    - typings.babylonjs.babylonjsInts.`1000`
    - typings.babylonjs.babylonjsInts.`2000`
    - typings.babylonjs.babylonjsInts.`0`
    - typings.babylonjs.babylonjsInts.`4001`
    - typings.babylonjs.babylonjsInts.`4002`
  */
  trait ErrorCodesType extends StObject
  object ErrorCodesType {
    
    inline def `0`: typings.babylonjs.babylonjsInts.`0` = 0.asInstanceOf[typings.babylonjs.babylonjsInts.`0`]
    
    inline def `1000`: typings.babylonjs.babylonjsInts.`1000` = 1000.asInstanceOf[typings.babylonjs.babylonjsInts.`1000`]
    
    inline def `2000`: typings.babylonjs.babylonjsInts.`2000` = 2000.asInstanceOf[typings.babylonjs.babylonjsInts.`2000`]
    
    inline def `3000`: typings.babylonjs.babylonjsInts.`3000` = 3000.asInstanceOf[typings.babylonjs.babylonjsInts.`3000`]
    
    inline def `4000`: typings.babylonjs.babylonjsInts.`4000` = 4000.asInstanceOf[typings.babylonjs.babylonjsInts.`4000`]
    
    inline def `4001`: typings.babylonjs.babylonjsInts.`4001` = 4001.asInstanceOf[typings.babylonjs.babylonjsInts.`4001`]
    
    inline def `4002`: typings.babylonjs.babylonjsInts.`4002` = 4002.asInstanceOf[typings.babylonjs.babylonjsInts.`4002`]
  }
}
