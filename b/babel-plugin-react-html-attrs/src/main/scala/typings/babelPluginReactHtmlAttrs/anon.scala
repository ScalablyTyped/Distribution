package typings.babelPluginReactHtmlAttrs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.babelPluginReactHtmlAttrs.mod.Component
import typings.babelPluginReactHtmlAttrs.mod.ComponentType
import typings.babelPluginReactHtmlAttrs.mod.ReactNode
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.InferType
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.ValidationMap
import typings.propTypes.mod.Validator
import typings.std.Exclude
import typings.std.NonNullable
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any
  }
  object `0` {
    
    @scala.inline
    def apply(
      defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any
    ): `0` = {
      val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultProps(value: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    var ref: js.UndefOr[Exclude[js.Any, String]] = js.undefined
  }
  object `1` {
    
    @scala.inline
    def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: Exclude[js.Any, String]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object Children {
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Default[T /* <: ComponentType[js.Any] */] extends StObject {
    
    var default: T
  }
  object Default {
    
    @scala.inline
    def apply[T /* <: ComponentType[js.Any] */](default: T): Default[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default[T]]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default[?], T /* <: ComponentType[js.Any] */] (val x: Self & Default[T]) extends AnyVal {
      
      @scala.inline
      def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultProps extends StObject {
    
    var defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any
    
    var propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  }
  object DefaultProps {
    
    @scala.inline
    def apply(
      defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any,
      propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
    ): DefaultProps = {
      val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], propTypes = propTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps]
    }
    
    @scala.inline
    implicit class DefaultPropsMutableBuilder[Self <: DefaultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultProps(value: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropTypes(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[T /* <: Validator[js.Any] */](types: js.Array[T]): Requireable[NonNullable[InferType[T]]] = js.native
  }
  
  @js.native
  trait Fn1 extends StObject {
    
    def apply[T](`type`: Validator[T]): Requireable[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: T}
      */ typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.Fn1 & TopLevel[js.Any]
      ] = js.native
  }
  
  @js.native
  trait Fn2 extends StObject {
    
    def apply[P /* <: ValidationMap[js.Any] */](`type`: P): Requireable[InferProps[P]] = js.native
  }
  
  @js.native
  trait Fn3 extends StObject {
    
    def apply[P /* <: ValidationMap[js.Any] */](`type`: P): Requireable[Required[InferProps[P]]] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](expectedClass: Instantiable1[/* args (repeated) */ js.Any, T]): Requireable[T] = js.native
  }
  
  @js.native
  trait FnCallType extends StObject {
    
    def apply[T](`type`: Validator[T]): Requireable[js.Array[T]] = js.native
  }
  
  @js.native
  trait FnCallTypes extends StObject {
    
    def apply[T](types: js.Array[T]): Requireable[T] = js.native
  }
  
  trait Html extends StObject {
    
    var __html: String
  }
  object Html {
    
    @scala.inline
    def apply(__html: String): Html = {
      val __obj = js.Dynamic.literal(__html = __html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit class HtmlMutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__html(value: String): Self = StObject.set(x, "__html", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* props */ js.Any, Component[js.Any, js.Object, js.Any]]
  
  trait PropTypes extends StObject {
    
    var propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  }
  object PropTypes {
    
    @scala.inline
    def apply(propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): PropTypes = {
      val __obj = js.Dynamic.literal(propTypes = propTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropTypes]
    }
    
    @scala.inline
    implicit class PropTypesMutableBuilder[Self <: PropTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPropTypes(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  children :babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ReactNode | undefined}> */
  trait ReadonlychildrenReactNode extends StObject {
    
    val children: js.UndefOr[ReactNode] = js.undefined
  }
  object ReadonlychildrenReactNode {
    
    @scala.inline
    def apply(): ReadonlychildrenReactNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlychildrenReactNode]
    }
    
    @scala.inline
    implicit class ReadonlychildrenReactNodeMutableBuilder[Self <: ReadonlychildrenReactNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Ref extends StObject {
    
    var ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any
      ] = js.undefined
  }
  object Ref {
    
    @scala.inline
    def apply(): Ref = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref]
    }
    
    @scala.inline
    implicit class RefMutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
