package typings.chartJs

import typings.chartJs.anon.R
import typings.chartJs.chartJsStrings.line
import typings.chartJs.chartJsStrings.scatter
import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distHelpersHelpersDotconfigDottypesMod.ContextProxy
import typings.chartJs.distHelpersHelpersDotconfigDottypesMod.Descriptor
import typings.chartJs.distHelpersHelpersDotconfigDottypesMod.DescriptorDefaults
import typings.chartJs.distHelpersHelpersDotconfigDottypesMod.ResolverCache
import typings.chartJs.distHelpersHelpersDotconfigDottypesMod.ResolverObjectKey
import typings.chartJs.distHelpersHelpersDotconfigDottypesMod.ResolverProxy
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesIndexMod.ChartMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersHelpersDotconfigMod {
  
  @JSImport("chart.js/dist/helpers/helpers.config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachContext[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](proxy: ResolverProxy[T, R], context: AnyObject): ContextProxy[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("_attachContext")(proxy.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ContextProxy[T, R]]
  inline def attachContext[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    proxy: ResolverProxy[T, R],
    context: AnyObject,
    subProxy: Unit,
    descriptorDefaults: DescriptorDefaults
  ): ContextProxy[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("_attachContext")(proxy.asInstanceOf[js.Any], context.asInstanceOf[js.Any], subProxy.asInstanceOf[js.Any], descriptorDefaults.asInstanceOf[js.Any])).asInstanceOf[ContextProxy[T, R]]
  inline def attachContext[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](proxy: ResolverProxy[T, R], context: AnyObject, subProxy: ResolverProxy[T, R]): ContextProxy[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("_attachContext")(proxy.asInstanceOf[js.Any], context.asInstanceOf[js.Any], subProxy.asInstanceOf[js.Any])).asInstanceOf[ContextProxy[T, R]]
  inline def attachContext[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    proxy: ResolverProxy[T, R],
    context: AnyObject,
    subProxy: ResolverProxy[T, R],
    descriptorDefaults: DescriptorDefaults
  ): ContextProxy[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("_attachContext")(proxy.asInstanceOf[js.Any], context.asInstanceOf[js.Any], subProxy.asInstanceOf[js.Any], descriptorDefaults.asInstanceOf[js.Any])).asInstanceOf[ContextProxy[T, R]]
  
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: js.Array[String], rootScopes: R): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    scopes: T,
    prefixes: js.Array[String],
    rootScopes: R,
    fallback: Unit,
    getTarget: js.Function0[AnyObject]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: js.Array[String], rootScopes: R, fallback: ResolverObjectKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    scopes: T,
    prefixes: js.Array[String],
    rootScopes: R,
    fallback: ResolverObjectKey,
    getTarget: js.Function0[AnyObject]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    scopes: T,
    prefixes: js.Array[String],
    rootScopes: Unit,
    fallback: Unit,
    getTarget: js.Function0[AnyObject]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: js.Array[String], rootScopes: Unit, fallback: ResolverObjectKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    scopes: T,
    prefixes: js.Array[String],
    rootScopes: Unit,
    fallback: ResolverObjectKey,
    getTarget: js.Function0[AnyObject]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: Unit, rootScopes: R): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: Unit, rootScopes: R, fallback: Unit, getTarget: js.Function0[AnyObject]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: Unit, rootScopes: R, fallback: ResolverObjectKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    scopes: T,
    prefixes: Unit,
    rootScopes: R,
    fallback: ResolverObjectKey,
    getTarget: js.Function0[AnyObject]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: Unit, rootScopes: Unit, fallback: Unit, getTarget: js.Function0[AnyObject]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: Unit, rootScopes: Unit, fallback: ResolverObjectKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    scopes: T,
    prefixes: Unit,
    rootScopes: Unit,
    fallback: ResolverObjectKey,
    getTarget: js.Function0[AnyObject]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def descriptors(proxy: ResolverCache[js.Array[AnyObject], js.Array[AnyObject]]): Descriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("_descriptors")(proxy.asInstanceOf[js.Any]).asInstanceOf[Descriptor]
  inline def descriptors(proxy: ResolverCache[js.Array[AnyObject], js.Array[AnyObject]], defaults: DescriptorDefaults): Descriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("_descriptors")(proxy.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Descriptor]
  
  inline def parseObjectDataRadialScale(
    meta: ChartMeta[line | scatter, default[AnyObject, AnyObject], default[AnyObject, AnyObject]],
    data: js.Array[AnyObject],
    start: Double,
    count: Double
  ): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("_parseObjectDataRadialScale")(meta.asInstanceOf[js.Any], data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
}
