package typings.cavy

import typings.cavy.anon.GenerateTestHook
import typings.cavy.cavyBooleans.`true`
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cavy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cavy", "TestHookStore")
  @js.native
  class TestHookStore () extends StObject
  
  @JSImport("cavy", "TestScope")
  @js.native
  class TestScope () extends StObject {
    
    def beforeEach(fn: js.Function0[Unit]): Unit = js.native
    
    var component: Tester = js.native
    
    def containsText(identifier: String, text: String): js.Promise[Unit] = js.native
    
    def describe(label: String, fn: js.Function0[Unit]): Unit = js.native
    
    def exists(identifier: String): js.Promise[`true`] = js.native
    
    def fillIn(identifier: String, str: String): js.Promise[Unit] = js.native
    
    def findComponent(identifier: String): js.Promise[Component[js.Object, js.Object, js.Any]] = js.native
    
    def focus(identifier: String): js.Promise[Unit] = js.native
    
    def it(label: String, fn: js.Function0[Unit]): Unit = js.native
    
    def notExists(identifier: String): js.Promise[`true`] = js.native
    
    def pause(time: Double): js.Promise[Unit] = js.native
    
    def press(identifier: String): js.Promise[Unit] = js.native
  }
  
  @JSImport("cavy", "Tester")
  @js.native
  class Tester protected ()
    extends Component[TesterProps, js.Object, js.Any] {
    def this(props: TesterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TesterProps, context: js.Any) = this()
    
    def clearAsync(): js.Promise[Unit] = js.native
    
    def reRender(): Unit = js.native
  }
  
  @scala.inline
  def hook[P /* <: js.Object */](WrappedComponent: ComponentClass[WithTestHook[P], ComponentState]): ComponentClass[P, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("hook")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[P, ComponentState]]
  
  @scala.inline
  def useCavy(): TestHookGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("useCavy")().asInstanceOf[TestHookGenerator]
  
  @scala.inline
  def wrap[P /* <: js.Object */](WrappedComponent: js.Object): ComponentClass[P, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[P, ComponentState]]
  @scala.inline
  def wrap[P /* <: js.Object */](WrappedComponent: FunctionComponent[P]): ComponentClass[P, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[P, ComponentState]]
  
  type RefCallback = js.Function1[/* element */ ReactNode | Null, Unit]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.cavy.mod.TestHookGeneratorWithRefObject because Already inherited */ @js.native
  trait TestHookGenerator extends TestHookGeneratorWithRefCallback
  
  type TestHookGeneratorWithRefCallback = js.Function2[/* label */ String, /* ref */ js.UndefOr[RefCallback], RefCallback]
  
  type TestHookGeneratorWithRefObject = js.Function2[/* label */ String, /* ref */ js.UndefOr[RefObject[js.Any]], RefObject[js.Any]]
  
  trait TestReport extends StObject {
    
    var duration: Double
    
    var errorCount: Double
    
    var results: js.Array[TestResult]
  }
  object TestReport {
    
    @scala.inline
    def apply(duration: Double, errorCount: Double, results: js.Array[TestResult]): TestReport = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], errorCount = errorCount.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestReport]
    }
    
    @scala.inline
    implicit class TestReportMutableBuilder[Self <: TestReport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResults(value: js.Array[TestResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsVarargs(value: TestResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
  
  trait TestResult extends StObject {
    
    var message: String
    
    var passed: Boolean
  }
  object TestResult {
    
    @scala.inline
    def apply(message: String, passed: Boolean): TestResult = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestResult]
    }
    
    @scala.inline
    implicit class TestResultMutableBuilder[Self <: TestResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    }
  }
  
  trait TesterProps extends StObject {
    
    var clearAsyncStorage: js.UndefOr[Boolean] = js.undefined
    
    var reporter: js.UndefOr[js.Function1[/* report */ TestReport, Unit]] = js.undefined
    
    // Deprecated
    var sendReport: js.UndefOr[Boolean] = js.undefined
    
    var specs: js.Array[js.Function1[/* spec */ TestScope, Unit]]
    
    var startDelay: js.UndefOr[Double] = js.undefined
    
    var store: TestHookStore
    
    var waitTime: js.UndefOr[Double] = js.undefined
  }
  object TesterProps {
    
    @scala.inline
    def apply(specs: js.Array[js.Function1[/* spec */ TestScope, Unit]], store: TestHookStore): TesterProps = {
      val __obj = js.Dynamic.literal(specs = specs.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[TesterProps]
    }
    
    @scala.inline
    implicit class TesterPropsMutableBuilder[Self <: TesterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearAsyncStorage(value: Boolean): Self = StObject.set(x, "clearAsyncStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearAsyncStorageUndefined: Self = StObject.set(x, "clearAsyncStorage", js.undefined)
      
      @scala.inline
      def setReporter(value: /* report */ TestReport => Unit): Self = StObject.set(x, "reporter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      @scala.inline
      def setSendReport(value: Boolean): Self = StObject.set(x, "sendReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendReportUndefined: Self = StObject.set(x, "sendReport", js.undefined)
      
      @scala.inline
      def setSpecs(value: js.Array[js.Function1[/* spec */ TestScope, Unit]]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecsVarargs(value: (js.Function1[/* spec */ TestScope, Unit])*): Self = StObject.set(x, "specs", js.Array(value :_*))
      
      @scala.inline
      def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
      
      @scala.inline
      def setStore(value: TestHookStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitTime(value: Double): Self = StObject.set(x, "waitTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitTimeUndefined: Self = StObject.set(x, "waitTime", js.undefined)
    }
  }
  
  type WithTestHook[P /* <: js.Object */] = P & GenerateTestHook
}
