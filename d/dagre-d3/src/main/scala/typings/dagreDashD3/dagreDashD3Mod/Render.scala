package typings.dagreDashD3.dagreDashD3Mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.dagre.dagreMod.Edge
import typings.dagre.dagreMod.Node
import typings.dagre.dagreMod.graphlib.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Render extends js.Object {
  def apply(
    selection: Selection[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    g: Graph
  ): Unit = js.native
  // see http://cpettitt.github.io/project/dagre-d3/latest/demo/user-defined.html for example usage
  def arrows(): StringDictionary[
    js.Function4[
      /* parent */ Selection[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
      ], 
      /* id */ String, 
      /* edge */ Edge, 
      /* type */ String, 
      Unit
    ]
  ] = js.native
  def shapes(): StringDictionary[
    js.Function3[
      /* parent */ Selection[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
      ], 
      /* bbox */ js.Any, 
      /* node */ Node, 
      Unit
    ]
  ] = js.native
}

@JSImport("dagre-d3", "render")
@js.native
class render () extends Render

@JSImport("dagre-d3", "render")
@js.native
object render extends Instantiable0[Render]

