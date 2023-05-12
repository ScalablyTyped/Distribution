package typings.bindEventListener

import typings.bindEventListener.distTypesMod.InferEventType
import typings.bindEventListener.distTypesMod.UnbindFn
import typings.std.AddEventListenerOptions
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBindAllMod {
  
  @JSImport("bind-event-listener/dist/bind-all", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindAll[TTarget /* <: EventTarget */, TTypes /* <: js.Array[InferEventType[TTarget] | String] */](
    target: TTarget,
    bindings: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof TTypes ]: {  type :TTypes[K],   listener :bind-event-listener.bind-event-listener/dist/types.Listener<TTarget, TTypes[K] & string>,   options :boolean | std.AddEventListenerOptions | undefined}} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof TTypes ]: {  type :TTypes[K],   listener :bind-event-listener.bind-event-listener/dist/types.Listener<TTarget, TTypes[K] & string>,   options :boolean | std.AddEventListenerOptions | undefined}} */ js.Any
    ]
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[TTarget /* <: EventTarget */, TTypes /* <: js.Array[InferEventType[TTarget] | String] */](
    target: TTarget,
    bindings: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof TTypes ]: {  type :TTypes[K],   listener :bind-event-listener.bind-event-listener/dist/types.Listener<TTarget, TTypes[K] & string>,   options :boolean | std.AddEventListenerOptions | undefined}} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof TTypes ]: {  type :TTypes[K],   listener :bind-event-listener.bind-event-listener/dist/types.Listener<TTarget, TTypes[K] & string>,   options :boolean | std.AddEventListenerOptions | undefined}} */ js.Any
    ],
    sharedOptions: Boolean
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[TTarget /* <: EventTarget */, TTypes /* <: js.Array[InferEventType[TTarget] | String] */](
    target: TTarget,
    bindings: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof TTypes ]: {  type :TTypes[K],   listener :bind-event-listener.bind-event-listener/dist/types.Listener<TTarget, TTypes[K] & string>,   options :boolean | std.AddEventListenerOptions | undefined}} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof TTypes ]: {  type :TTypes[K],   listener :bind-event-listener.bind-event-listener/dist/types.Listener<TTarget, TTypes[K] & string>,   options :boolean | std.AddEventListenerOptions | undefined}} */ js.Any
    ],
    sharedOptions: AddEventListenerOptions
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
}
