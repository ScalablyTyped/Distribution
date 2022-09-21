package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "ShaderStore")
@js.native
open class ShaderStore ()
  extends typings.babylonjs.enginesIndexMod.ShaderStore
/* static members */
object ShaderStore {
  
  @JSImport("babylonjs/index", "ShaderStore")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the include shaders store of a given shader language
    * @param shaderLanguage the shader language
    * @returns the include shaders store
    */
  inline def GetIncludesShadersStore(): org.scalablytyped.runtime.StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetIncludesShadersStore")().asInstanceOf[org.scalablytyped.runtime.StringDictionary[String]]
  inline def GetIncludesShadersStore(shaderLanguage: typings.babylonjs.shaderLanguageMod.ShaderLanguage): org.scalablytyped.runtime.StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetIncludesShadersStore")(shaderLanguage.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[String]]
  
  /**
    * Gets the shaders repository path for a given shader language
    * @param shaderLanguage the shader language
    * @returns the path to the shaders repository
    */
  inline def GetShadersRepository(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetShadersRepository")().asInstanceOf[String]
  inline def GetShadersRepository(shaderLanguage: typings.babylonjs.shaderLanguageMod.ShaderLanguage): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetShadersRepository")(shaderLanguage.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Gets the shaders store of a given shader language
    * @param shaderLanguage the shader language
    * @returns the shaders store
    */
  inline def GetShadersStore(): org.scalablytyped.runtime.StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetShadersStore")().asInstanceOf[org.scalablytyped.runtime.StringDictionary[String]]
  inline def GetShadersStore(shaderLanguage: typings.babylonjs.shaderLanguageMod.ShaderLanguage): org.scalablytyped.runtime.StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetShadersStore")(shaderLanguage.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[String]]
  
  /**
    * Store of each included file for a shader (The can be looked up using effect.key)
    */
  @JSImport("babylonjs/index", "ShaderStore.IncludesShadersStore")
  @js.native
  def IncludesShadersStore: org.scalablytyped.runtime.StringDictionary[String] = js.native
  
  /**
    * Store of each included file for a shader (WGSL)
    */
  @JSImport("babylonjs/index", "ShaderStore.IncludesShadersStoreWGSL")
  @js.native
  def IncludesShadersStoreWGSL: org.scalablytyped.runtime.StringDictionary[String] = js.native
  inline def IncludesShadersStoreWGSL_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IncludesShadersStoreWGSL")(x.asInstanceOf[js.Any])
  
  inline def IncludesShadersStore_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IncludesShadersStore")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the relative url used to load shaders if using the engine in non-minified mode
    */
  @JSImport("babylonjs/index", "ShaderStore.ShadersRepository")
  @js.native
  def ShadersRepository: String = js.native
  
  /**
    * Gets or sets the relative url used to load shaders (WGSL) if using the engine in non-minified mode
    */
  @JSImport("babylonjs/index", "ShaderStore.ShadersRepositoryWGSL")
  @js.native
  def ShadersRepositoryWGSL: String = js.native
  inline def ShadersRepositoryWGSL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShadersRepositoryWGSL")(x.asInstanceOf[js.Any])
  
  inline def ShadersRepository_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShadersRepository")(x.asInstanceOf[js.Any])
  
  /**
    * Store of each shader (The can be looked up using effect.key)
    */
  @JSImport("babylonjs/index", "ShaderStore.ShadersStore")
  @js.native
  def ShadersStore: org.scalablytyped.runtime.StringDictionary[String] = js.native
  
  /**
    * Store of each shader  (WGSL)
    */
  @JSImport("babylonjs/index", "ShaderStore.ShadersStoreWGSL")
  @js.native
  def ShadersStoreWGSL: org.scalablytyped.runtime.StringDictionary[String] = js.native
  inline def ShadersStoreWGSL_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShadersStoreWGSL")(x.asInstanceOf[js.Any])
  
  inline def ShadersStore_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShadersStore")(x.asInstanceOf[js.Any])
}
