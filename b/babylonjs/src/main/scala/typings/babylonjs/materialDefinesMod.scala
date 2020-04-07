package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/materialDefines", JSImport.Namespace)
@js.native
object materialDefinesMod extends js.Object {
  @js.native
  class MaterialDefines ()
    extends /* id */ StringDictionary[js.Any] {
    /** @hidden */
    var _areAttributesDirty: Boolean = js.native
    /** @hidden */
    var _areFresnelDirty: Boolean = js.native
    /** @hidden */
    var _areImageProcessingDirty: Boolean = js.native
    /** @hidden */
    var _areLightsDirty: Boolean = js.native
    /** @hidden */
    var _areLightsDisposed: Boolean = js.native
    /** @hidden */
    var _areMiscDirty: Boolean = js.native
    /** @hidden */
    var _areTexturesDirty: Boolean = js.native
    var _isDirty: js.Any = js.native
    /** @hidden */
    var _keys: js.Array[String] = js.native
    /** @hidden */
    var _needNormals: Boolean = js.native
    /** @hidden */
    var _needUVs: Boolean = js.native
    /** @hidden */
    var _normals: Boolean = js.native
    /** @hidden */
    var _renderId: Double = js.native
    /** @hidden */
    var _uvs: Boolean = js.native
    /**
      * Clones this instance's defines to another instance
      * @param other - material defines to clone values to
      */
    def cloneTo(other: MaterialDefines): Unit = js.native
    /**
      * Specifies if the material needs to be re-calculated
      */
    def isDirty(): Boolean = js.native
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

