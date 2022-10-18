package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsMaterialDefinesMod {
  
  @JSImport("babylonjs/Materials/materialDefines", "MaterialDefines")
  @js.native
  /**
    * Creates a new instance
    * @param externalProperties list of external properties to inject into the object
    */
  open class MaterialDefines ()
    extends StObject
       with /* id */ StringDictionary[Any] {
    def this(externalProperties: StringDictionary[Default]) = this()
    
    /** @internal */
    var _areAttributesDirty: Boolean = js.native
    
    /** @internal */
    var _areFresnelDirty: Boolean = js.native
    
    /** @internal */
    var _areImageProcessingDirty: Boolean = js.native
    
    /** @internal */
    var _areLightsDirty: Boolean = js.native
    
    /** @internal */
    var _areLightsDisposed: Boolean = js.native
    
    /** @internal */
    var _areMiscDirty: Boolean = js.native
    
    /** @internal */
    var _arePrePassDirty: Boolean = js.native
    
    /** @internal */
    var _areTexturesDirty: Boolean = js.native
    
    /* protected */ var _externalProperties: js.UndefOr[StringDictionary[Default]] = js.native
    
    /* private */ var _isDirty: Any = js.native
    
    /** @internal */
    /* protected */ var _keys: js.Array[String] = js.native
    
    /** @internal */
    var _needNormals: Boolean = js.native
    
    /** @internal */
    var _needUVs: Boolean = js.native
    
    /** @internal */
    var _normals: Boolean = js.native
    
    /** @internal */
    var _renderId: Double = js.native
    
    /* private */ var _setDefaultValue: Any = js.native
    
    /** @internal */
    var _uvs: Boolean = js.native
    
    /**
      * Clones this instance's defines to another instance
      * @param other - material defines to clone values to
      */
    def cloneTo(other: MaterialDefines): Unit = js.native
    
    /**
      * Specifies if the material needs to be re-calculated
      */
    def isDirty: Boolean = js.native
    
    /**
      * Specifies if two material defines are equal
      * @param other - A material define instance to compare to
      * @returns - Boolean indicating if the material defines are equal (true) or not (false)
      */
    def isEqual(other: MaterialDefines): Boolean = js.native
    
    /**
      * Marks the material to indicate all of its defines need to be re-calculated
      */
    def markAllAsDirty(): Unit = js.native
    
    /**
      * Marks the attribute state as changed
      */
    def markAsAttributesDirty(): Unit = js.native
    
    /**
      * Marks the fresnel state as changed
      */
    def markAsFresnelDirty(): Unit = js.native
    
    /**
      * Marks the material to indicate that image processing needs to be re-calculated
      */
    def markAsImageProcessingDirty(): Unit = js.native
    
    /**
      * Marks the material to indicate the lights need to be re-calculated
      * @param disposed Defines whether the light is dirty due to dispose or not
      */
    def markAsLightDirty(): Unit = js.native
    def markAsLightDirty(disposed: Boolean): Unit = js.native
    
    /**
      * Marks the misc state as changed
      */
    def markAsMiscDirty(): Unit = js.native
    
    /**
      * Marks the prepass state as changed
      */
    def markAsPrePassDirty(): Unit = js.native
    
    /**
      * Marks the material to indicate that it has been re-calculated
      */
    def markAsProcessed(): Unit = js.native
    
    /**
      * Marks the texture state as changed
      */
    def markAsTexturesDirty(): Unit = js.native
    
    /**
      * Marks the material to indicate that it needs to be re-calculated
      */
    def markAsUnprocessed(): Unit = js.native
    
    /**
      * Rebuilds the material defines
      */
    def rebuild(): Unit = js.native
    
    /**
      * Resets the material define values
      */
    def reset(): Unit = js.native
  }
}
