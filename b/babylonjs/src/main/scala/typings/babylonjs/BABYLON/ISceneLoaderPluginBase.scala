package typings.babylonjs.BABYLON

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISceneLoaderPluginBase extends StObject {
  
  /**
    * The callback that returns true if the data can be directly loaded.
    * @param data string containing the file data
    * @returns if the data can be loaded directly
    */
  var canDirectLoad: js.UndefOr[js.Function1[/* data */ String, Boolean]] = js.undefined
  
  /**
    * The callback that returns the data to pass to the plugin if the data can be directly loaded.
    * @param scene scene loading this data
    * @param data string containing the data
    * @returns data to pass to the plugin
    */
  var directLoad: js.UndefOr[js.Function2[/* scene */ Scene, /* data */ String, Any]] = js.undefined
  
  /**
    * The file extensions supported by this plugin.
    */
  var extensions: String | ISceneLoaderPluginExtensions
  
  /**
    * The callback called when loading from a url.
    * @param scene scene loading this url
    * @param fileOrUrl file or url to load
    * @param onSuccess callback called when the file successfully loads
    * @param onProgress callback called while file is loading (if the server supports this mode)
    * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
    * @param onError callback called when the file fails to load
    * @returns a file request object
    */
  var loadFile: js.UndefOr[
    js.Function6[
      /* scene */ Scene, 
      /* fileOrUrl */ File | String, 
      /* onSuccess */ js.Function2[/* data */ Any, /* responseURL */ js.UndefOr[String], Unit], 
      /* onProgress */ js.UndefOr[js.Function1[/* ev */ ISceneLoaderProgressEvent, Unit]], 
      /* useArrayBuffer */ js.UndefOr[Boolean], 
      /* onError */ js.UndefOr[
        js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
      ], 
      IFileRequest
    ]
  ] = js.undefined
  
  /**
    * The friendly name of this plugin.
    */
  var name: String
  
  /**
    * The callback that allows custom handling of the root url based on the response url.
    * @param rootUrl the original root url
    * @param responseURL the response url if available
    * @returns the new root url
    */
  var rewriteRootURL: js.UndefOr[js.Function2[/* rootUrl */ String, /* responseURL */ js.UndefOr[String], String]] = js.undefined
}
object ISceneLoaderPluginBase {
  
  inline def apply(extensions: String | ISceneLoaderPluginExtensions, name: String): ISceneLoaderPluginBase = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneLoaderPluginBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISceneLoaderPluginBase] (val x: Self) extends AnyVal {
    
    inline def setCanDirectLoad(value: /* data */ String => Boolean): Self = StObject.set(x, "canDirectLoad", js.Any.fromFunction1(value))
    
    inline def setCanDirectLoadUndefined: Self = StObject.set(x, "canDirectLoad", js.undefined)
    
    inline def setDirectLoad(value: (/* scene */ Scene, /* data */ String) => Any): Self = StObject.set(x, "directLoad", js.Any.fromFunction2(value))
    
    inline def setDirectLoadUndefined: Self = StObject.set(x, "directLoad", js.undefined)
    
    inline def setExtensions(value: String | ISceneLoaderPluginExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setLoadFile(
      value: (/* scene */ Scene, /* fileOrUrl */ File | String, /* onSuccess */ js.Function2[/* data */ Any, /* responseURL */ js.UndefOr[String], Unit], /* onProgress */ js.UndefOr[js.Function1[/* ev */ ISceneLoaderProgressEvent, Unit]], /* useArrayBuffer */ js.UndefOr[Boolean], /* onError */ js.UndefOr[
          js.Function2[
            /* request */ js.UndefOr[WebRequest], 
            /* exception */ js.UndefOr[LoadFileError], 
            Unit
          ]
        ]) => IFileRequest
    ): Self = StObject.set(x, "loadFile", js.Any.fromFunction6(value))
    
    inline def setLoadFileUndefined: Self = StObject.set(x, "loadFile", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRewriteRootURL(value: (/* rootUrl */ String, /* responseURL */ js.UndefOr[String]) => String): Self = StObject.set(x, "rewriteRootURL", js.Any.fromFunction2(value))
    
    inline def setRewriteRootURLUndefined: Self = StObject.set(x, "rewriteRootURL", js.undefined)
  }
}
