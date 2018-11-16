package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Manages the defines for the Material
     */
@JSGlobal("BABYLON.MaterialDefines")
@js.native
class MaterialDefines () extends js.Object {
  /** @hidden */
  var _areAttributesDirty: scala.Boolean = js.native
  /** @hidden */
  var _areFresnelDirty: scala.Boolean = js.native
  /** @hidden */
  var _areImageProcessingDirty: scala.Boolean = js.native
  /** @hidden */
  var _areLightsDirty: scala.Boolean = js.native
  /** @hidden */
  var _areMiscDirty: scala.Boolean = js.native
  /** @hidden */
  var _areTexturesDirty: scala.Boolean = js.native
  var _isDirty: js.Any = js.native
  var _keys: js.Any = js.native
  /** @hidden */
  var _needNormals: scala.Boolean = js.native
  /** @hidden */
  var _needUVs: scala.Boolean = js.native
  /** @hidden */
  var _normals: scala.Boolean = js.native
  /** @hidden */
  var _renderId: scala.Double = js.native
  /** @hidden */
  var _uvs: scala.Boolean = js.native
  /**
           * Specifies if the material needs to be re-calculated
           */
  val isDirty: scala.Boolean = js.native
  /**
           * Clones this instance's defines to another instance
           * @param other - material defines to clone values to
           */
  def cloneTo(other: MaterialDefines): scala.Unit = js.native
  /**
           * Specifies if two material defines are equal
           * @param other - A material define instance to compare to
           * @returns - Boolean indicating if the material defines are equal (true) or not (false)
           */
  def isEqual(other: MaterialDefines): scala.Boolean = js.native
  /**
           * Marks the material to indicate all of its defines need to be re-calculated
           */
  def markAllAsDirty(): scala.Unit = js.native
  /**
           * Marks the attribute state as changed
           */
  def markAsAttributesDirty(): scala.Unit = js.native
  /**
           * Marks the fresnel state as changed
           */
  def markAsFresnelDirty(): scala.Unit = js.native
  /**
           * Marks the material to indicate that image processing needs to be re-calculated
           */
  def markAsImageProcessingDirty(): scala.Unit = js.native
  /**
           * Marks the material to indicate the lights need to be re-calculated
           */
  def markAsLightDirty(): scala.Unit = js.native
  /**
           * Marks the misc state as changed
           */
  def markAsMiscDirty(): scala.Unit = js.native
  /**
           * Marks the material to indicate that it has been re-calculated
           */
  def markAsProcessed(): scala.Unit = js.native
  /**
           * Marks the texture state as changed
           */
  def markAsTexturesDirty(): scala.Unit = js.native
  /**
           * Marks the material to indicate that it needs to be re-calculated
           */
  def markAsUnprocessed(): scala.Unit = js.native
  /**
           * Rebuilds the material defines
           */
  def rebuild(): scala.Unit = js.native
  /**
           * Resets the material define values
           */
  def reset(): scala.Unit = js.native
}

