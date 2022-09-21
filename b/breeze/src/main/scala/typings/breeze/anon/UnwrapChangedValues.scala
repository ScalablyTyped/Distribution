package typings.breeze.anon

import typings.breeze.breeze.ComplexObject
import typings.breeze.breeze.DataProperty
import typings.breeze.breeze.Entity
import typings.breeze.breeze.MetadataStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnwrapChangedValues extends StObject {
  
  def unwrapChangedValues(
    entity: Entity,
    metadataStore: MetadataStore,
    transformFn: js.Function2[/* dp */ DataProperty, /* val */ Any, Any]
  ): Any = js.native
  
  def unwrapInstance(structObj: Any, transformFn: js.Function2[/* dp */ DataProperty, /* val */ Any, Any]): Any = js.native
  
  def unwrapOriginalValues(
    target: ComplexObject,
    metadataStore: MetadataStore,
    transformFn: js.Function2[/* dp */ DataProperty, /* val */ Any, Any]
  ): Any = js.native
  def unwrapOriginalValues(
    target: Entity,
    metadataStore: MetadataStore,
    transformFn: js.Function2[/* dp */ DataProperty, /* val */ Any, Any]
  ): Any = js.native
}
