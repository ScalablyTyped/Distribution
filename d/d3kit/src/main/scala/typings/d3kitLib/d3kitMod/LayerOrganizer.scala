package typings
package d3kitLib.d3kitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "LayerOrganizer")
@js.native
class LayerOrganizer protected () extends js.Object {
  def this(container: d3DashSelectionLib.d3DashSelectionMod.Selection[
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      _
    ]) = this()
  def this(container: d3DashSelectionLib.d3DashSelectionMod.Selection[
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      _
    ], defaultTag: java.lang.String) = this()
  def create(layerNames: LayerConfig): (d3DashSelectionLib.d3DashSelectionMod.Selection[
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _
  ]) | (js.Array[
    d3DashSelectionLib.d3DashSelectionMod.Selection[
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      _
    ]
  ]) = js.native
  def create(layerNames: java.lang.String): (d3DashSelectionLib.d3DashSelectionMod.Selection[
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _
  ]) | (js.Array[
    d3DashSelectionLib.d3DashSelectionMod.Selection[
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      _
    ]
  ]) = js.native
  def create(layerNames: js.Array[LayerConfig | java.lang.String]): (d3DashSelectionLib.d3DashSelectionMod.Selection[
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _
  ]) | (js.Array[
    d3DashSelectionLib.d3DashSelectionMod.Selection[
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      _
    ]
  ]) = js.native
  def get(name: java.lang.String): d3DashSelectionLib.d3DashSelectionMod.Selection[
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _
  ] = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
}

