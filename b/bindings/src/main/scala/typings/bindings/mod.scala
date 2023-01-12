package typings.bindings

import typings.node.processMod.global.NodeJS.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The main `bindings()` function loads the compiled bindings for a given module.
    * It uses V8's Error API to determine the parent filename that this function is
    * being invoked from, which is then used to find the root directory.
    */
  inline def apply(mod: String): Any = ^.asInstanceOf[js.Dynamic].apply(mod.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(mod: Options): Any = ^.asInstanceOf[js.Dynamic].apply(mod.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("bindings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the filename of the JavaScript file that invokes this function.
    * Used to help find the root directory of a module.
    * Optionally accepts an filename argument to skip when searching for the invoking filename
    */
  inline def getFileName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileName")().asInstanceOf[String]
  inline def getFileName(calling_file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileName")(calling_file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Gets the root directory of a module, given an arbitrary filename
    * somewhere in the module tree. The "root directory" is the directory
    * containing the `package.json` file.
    *
    *   In:  /home/nate/node-native-module/lib/index.js
    *   Out: /home/nate/node-native-module
    */
  inline def getRoot(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoot")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /** @default process.arch */
    var arch: js.UndefOr[String] = js.undefined
    
    /** @default process.env.NODE_BINDINGS_ARROW || ' → ' */
    var arrow: js.UndefOr[String] = js.undefined
    
    /** @default 'bindings.node' */
    var bindings: js.UndefOr[String] = js.undefined
    
    /** @default process.env.NODE_BINDINGS_COMPILED_DIR || 'compiled' */
    var compiled: js.UndefOr[String] = js.undefined
    
    /** @default `node-v${process.versions.modules}-${process.platform}-${process.arch}` */
    var nodePreGyp: js.UndefOr[String] = js.undefined
    
    /** @default process.platform */
    var platform: js.UndefOr[Platform] = js.undefined
    
    var `try`: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
    
    /** @default process.versions.node */
    var version: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      inline def setArrow(value: String): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setBindings(value: String): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
      
      inline def setCompiled(value: String): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
      
      inline def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
      
      inline def setNodePreGyp(value: String): Self = StObject.set(x, "nodePreGyp", value.asInstanceOf[js.Any])
      
      inline def setNodePreGypUndefined: Self = StObject.set(x, "nodePreGyp", js.undefined)
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setTry(value: js.Array[js.Array[String]]): Self = StObject.set(x, "try", value.asInstanceOf[js.Any])
      
      inline def setTryUndefined: Self = StObject.set(x, "try", js.undefined)
      
      inline def setTryVarargs(value: js.Array[String]*): Self = StObject.set(x, "try", js.Array(value*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
