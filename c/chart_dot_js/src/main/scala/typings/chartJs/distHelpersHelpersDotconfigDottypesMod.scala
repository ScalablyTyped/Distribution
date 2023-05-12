package typings.chartJs

import typings.chartJs.chartJsStrings.Object
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesUtilsMod.Merge
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersHelpersDotconfigDottypesMod {
  
  trait ContextCache[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */] extends StObject {
    
    var _cacheable: Boolean
    
    var _context: AnyObject
    
    var _descriptors: Descriptor
    
    var _proxy: ResolverProxy[T, R]
    
    var _stack: Set[String]
    
    var _subProxy: ResolverProxy[T, R]
    
    def `override`[S /* <: AnyObject */](scope: S): ContextProxy[
        js.Array[
          (/* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any) | S
        ], 
        T | R
      ]
    
    def setContext(ctx: AnyObject): ContextProxy[T, R]
  }
  object ContextCache {
    
    inline def apply[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
      _cacheable: Boolean,
      _context: AnyObject,
      _descriptors: Descriptor,
      _proxy: ResolverProxy[T, R],
      _stack: Set[String],
      _subProxy: ResolverProxy[T, R],
      `override`: Any => ContextProxy[
          js.Array[
            (/* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any) | Any
          ], 
          T | R
        ],
      setContext: AnyObject => ContextProxy[T, R]
    ): ContextCache[T, R] = {
      val __obj = js.Dynamic.literal(_cacheable = _cacheable.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _descriptors = _descriptors.asInstanceOf[js.Any], _proxy = _proxy.asInstanceOf[js.Any], _stack = _stack.asInstanceOf[js.Any], _subProxy = _subProxy.asInstanceOf[js.Any], setContext = js.Any.fromFunction1(setContext))
      __obj.updateDynamic("override")(js.Any.fromFunction1(`override`))
      __obj.asInstanceOf[ContextCache[T, R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextCache[?, ?], T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */] (val x: Self & (ContextCache[T, R])) extends AnyVal {
      
      inline def setOverride(
        value: Any => ContextProxy[
              js.Array[
                (/* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any) | Any
              ], 
              T | R
            ]
      ): Self = StObject.set(x, "override", js.Any.fromFunction1(value))
      
      inline def setSetContext(value: AnyObject => ContextProxy[T, R]): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
      
      inline def set_cacheable(value: Boolean): Self = StObject.set(x, "_cacheable", value.asInstanceOf[js.Any])
      
      inline def set_context(value: AnyObject): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      inline def set_descriptors(value: Descriptor): Self = StObject.set(x, "_descriptors", value.asInstanceOf[js.Any])
      
      inline def set_proxy(value: ResolverProxy[T, R]): Self = StObject.set(x, "_proxy", value.asInstanceOf[js.Any])
      
      inline def set_stack(value: Set[String]): Self = StObject.set(x, "_stack", value.asInstanceOf[js.Any])
      
      inline def set_subProxy(value: ResolverProxy[T, R]): Self = StObject.set(x, "_subProxy", value.asInstanceOf[js.Any])
    }
  }
  
  type ContextProxy[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */] = (Merge[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ]) & (ContextCache[T, R])
  
  trait Descriptor extends StObject {
    
    var allKeys: Boolean
    
    var indexable: Boolean
    
    def isIndexable(key: String): Boolean
    
    def isScriptable(key: String): Boolean
    
    var scriptable: Boolean
  }
  object Descriptor {
    
    inline def apply(
      allKeys: Boolean,
      indexable: Boolean,
      isIndexable: String => Boolean,
      isScriptable: String => Boolean,
      scriptable: Boolean
    ): Descriptor = {
      val __obj = js.Dynamic.literal(allKeys = allKeys.asInstanceOf[js.Any], indexable = indexable.asInstanceOf[js.Any], isIndexable = js.Any.fromFunction1(isIndexable), isScriptable = js.Any.fromFunction1(isScriptable), scriptable = scriptable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Descriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Descriptor] (val x: Self) extends AnyVal {
      
      inline def setAllKeys(value: Boolean): Self = StObject.set(x, "allKeys", value.asInstanceOf[js.Any])
      
      inline def setIndexable(value: Boolean): Self = StObject.set(x, "indexable", value.asInstanceOf[js.Any])
      
      inline def setIsIndexable(value: String => Boolean): Self = StObject.set(x, "isIndexable", js.Any.fromFunction1(value))
      
      inline def setIsScriptable(value: String => Boolean): Self = StObject.set(x, "isScriptable", js.Any.fromFunction1(value))
      
      inline def setScriptable(value: Boolean): Self = StObject.set(x, "scriptable", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescriptorDefaults extends StObject {
    
    var allKeys: js.UndefOr[Boolean] = js.undefined
    
    var indexable: Boolean
    
    var scriptable: Boolean
  }
  object DescriptorDefaults {
    
    inline def apply(indexable: Boolean, scriptable: Boolean): DescriptorDefaults = {
      val __obj = js.Dynamic.literal(indexable = indexable.asInstanceOf[js.Any], scriptable = scriptable.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescriptorDefaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DescriptorDefaults] (val x: Self) extends AnyVal {
      
      inline def setAllKeys(value: Boolean): Self = StObject.set(x, "allKeys", value.asInstanceOf[js.Any])
      
      inline def setAllKeysUndefined: Self = StObject.set(x, "allKeys", js.undefined)
      
      inline def setIndexable(value: Boolean): Self = StObject.set(x, "indexable", value.asInstanceOf[js.Any])
      
      inline def setScriptable(value: Boolean): Self = StObject.set(x, "scriptable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResolverCache[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */] extends StObject {
    
    var _allKeys: js.UndefOr[Boolean] = js.native
    
    var _cacheable: Boolean = js.native
    
    var _fallback: ResolverObjectKey = js.native
    
    def _getTarget(): /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any = js.native
    
    var _indexable: js.UndefOr[Boolean] = js.native
    
    var _keys: js.UndefOr[js.Array[String]] = js.native
    
    var _rootScopes: T | R = js.native
    
    var _scopes: T = js.native
    
    var _scriptable: js.UndefOr[Boolean] = js.native
    
    var _storage: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
      ] = js.native
    
    def `override`[S /* <: AnyObject */](scope: S): ResolverProxy[
        js.Array[
          (/* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any) | S
        ], 
        T | R
      ] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: Object = js.native
  }
  
  type ResolverObjectKey = String | Boolean
  
  type ResolverProxy[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */] = (Merge[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ]) & (ResolverCache[T, R])
}
