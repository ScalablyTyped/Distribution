package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "TextureOptimization")
@js.native
/**
  * Creates the TextureOptimization object
  * @param priority defines the priority of this optimization (0 by default which means first in the list)
  * @param maximumSize defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
  * @param step defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
  */
open class TextureOptimization ()
  extends typings.babylonjs.legacyMod.TextureOptimization {
  def this(/**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double,
    /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Unit,
    /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double,
    /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: Double,
    /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  step: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double,
    /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: Unit,
    /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  step: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Unit,
    /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: Double,
    /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  step: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Unit,
    /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: Unit,
    /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  step: Double
  ) = this()
}
