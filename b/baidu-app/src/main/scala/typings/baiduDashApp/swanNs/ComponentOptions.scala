package typings.baiduDashApp.swanNs

import typings.baiduDashApp.Anon_AddGlobalClass
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Component组件参数
	 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof baidu-app.swan.Lifetimes ]:? baidu-app.swan.Lifetimes[P]} */ trait ComponentOptions[Instance /* <: Component[Data, Props] */, Data, Methods, Props] extends js.Object {
  /**
  		 * 类似于mixins和traits的组件间代码复用机制
  		 * 参见 [behaviors](https://smartprogram.baidu.com/docs/develop/framework/custom-component_behaviors/)
  		 */
  var behaviors: js.UndefOr[
    js.Array[
      (ComponentOptions[
        Component[js.Object, js.Object], 
        DefaultData[Component[js.Object, js.Object]], 
        DefaultMethods[Component[js.Object, js.Object]], 
        PropsDefinition[DefaultProps]
      ]) | String
    ]
  ] = js.undefined
  /**
  		 * 组件的内部数据，和 properties 一同用于组件的模版渲染
  		 */
  var data: js.UndefOr[Data] = js.undefined
  /**
  		 * 组件接受的外部样式类，参见 外部样式类
  		 *
  		 * 有时，组件希望接受外部传入的样式类（类似于 view 组件的 hover-class 属性）。
  		 * 此时可以在 Component 中用 externalClasses 定义段定义若干个外部样式类。这个特性从小程序基础库版本 1.9.90 开始支持。
  		 *
  		 * @version 1.9.90
  		 */
  var externalClasses: js.UndefOr[js.Array[String]] = js.undefined
  /**
  		 * 组件生命周期声明对象，组件的生命周期：created、attached、ready、moved、detached将收归到lifetimes字段内进行声明，
  		 * 原有声明方式仍旧有效，如同时存在两种声明方式，则lifetimes字段内声明方式优先级最高
  		 */
  var lifetimes: js.UndefOr[Partial[Lifetimes]] = js.undefined
  /**
  		 * 组件的方法，包括事件响应函数和任意的自定义方法
  		 * 关于事件响应函数的使用
  		 * 参见[组件事件](https://smartprogram.baidu.com/docs/develop/framework/custom-component_cont/)
  		 */
  var methods: js.UndefOr[Methods] = js.undefined
  /**
  		 * 一些组件选项，请参见文档其他部分的说明
  		 */
  var options: js.UndefOr[Partial[Anon_AddGlobalClass]] = js.undefined
  /**
  		 * 组件所在页面的生命周期声明对象，目前仅支持页面的show和hide两个生命周期
  		 */
  var pageLifetimes: js.UndefOr[Partial[PageLifetimes]] = js.undefined
  /**
  		 * 组件的对外属性，是属性名到属性设置的映射表
  		 * 属性设置中可包含三个字段:
  		 * type 表示属性类型、 value 表示属性初始值、 observer 表示属性值被更改时的响应函数
  		 */
  var properties: js.UndefOr[Props] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[Instance /* <: Component[Data, Props] */, Data, Methods, Props](
    behaviors: js.Array[
      (ComponentOptions[
        Component[js.Object, js.Object], 
        DefaultData[Component[js.Object, js.Object]], 
        DefaultMethods[Component[js.Object, js.Object]], 
        PropsDefinition[DefaultProps]
      ]) | String
    ] = null,
    data: Data = null,
    externalClasses: js.Array[String] = null,
    lifetimes: Partial[Lifetimes] = null,
    methods: Methods = null,
    options: Partial[Anon_AddGlobalClass] = null,
    pageLifetimes: Partial[PageLifetimes] = null,
    properties: Props = null
  ): ComponentOptions[Instance, Data, Methods, Props] = {
    val __obj = js.Dynamic.literal()
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (externalClasses != null) __obj.updateDynamic("externalClasses")(externalClasses)
    if (lifetimes != null) __obj.updateDynamic("lifetimes")(lifetimes)
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (pageLifetimes != null) __obj.updateDynamic("pageLifetimes")(pageLifetimes)
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[Instance, Data, Methods, Props]]
  }
}

