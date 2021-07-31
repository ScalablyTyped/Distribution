package typings.dc.mod

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3Transition.mod.Transition_
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base extends StObject {
  
  def afterTransition(
    transition: Transition_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    callback: js.Function1[
      /* transition */ Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      Unit
    ]
  ): Unit = js.native
  
  // http://dc-js.github.io/dc.js/docs/html/dc.barChart.html
  def barChart(parent: String): BarChart = js.native
  def barChart(parent: String, chartGroup: String): BarChart = js.native
  def barChart(parent: CompositeChart): BarChart = js.native
  def barChart(parent: CompositeChart, chartGroup: String): BarChart = js.native
  
  def boxPlot(parent: String): BoxPlot = js.native
  def boxPlot(parent: String, chartGroup: String): BoxPlot = js.native
  
  def bubbleChart(parent: String): BubbleChart = js.native
  def bubbleChart(parent: String, chartGroup: String): BubbleChart = js.native
  
  def bubbleOverlayChart(parent: String): BubbleOverlayChart = js.native
  def bubbleOverlayChart(parent: String, chartGroup: String): BubbleOverlayChart = js.native
  
  def cboxMenu(parent: String): CBoxMenu = js.native
  def cboxMenu(parent: String, chartGroup: String): CBoxMenu = js.native
  
  var chartRegistry: ChartRegistry = js.native
  
  def compositeChart(parent: String): CompositeChart = js.native
  def compositeChart(parent: String, chartGroup: String): CompositeChart = js.native
  
  var config: Config = js.native
  
  def dataCount(parent: String): DataCountWidget = js.native
  def dataCount(parent: String, chartGroup: String): DataCountWidget = js.native
  
  def dataGrid(parent: String): DataGridWidget = js.native
  def dataGrid(parent: String, chartGroup: String): DataGridWidget = js.native
  
  def dataTable(parent: String): DataTableWidget = js.native
  def dataTable(parent: String, chartGroup: String): DataTableWidget = js.native
  
  var dateFormat: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.time.Format */ js.Any = js.native
  
  def deregisterAllCharts(): Unit = js.native
  def deregisterAllCharts(group: String): Unit = js.native
  
  def deregisterChart(chart: BaseMixin[js.Any]): Unit = js.native
  def deregisterChart(chart: BaseMixin[js.Any], group: String): Unit = js.native
  
  var disableTransitions: Boolean = js.native
  
  var errors: Errors = js.native
  
  var events: Events = js.native
  
  def filterAll(): Unit = js.native
  def filterAll(group: String): Unit = js.native
  
  var filters: Filters = js.native
  
  def geoChoroplethChart(parent: String): GeoChoroplethChart = js.native
  def geoChoroplethChart(parent: String, chartGroup: String): GeoChoroplethChart = js.native
  
  def hasChart(chart: BaseMixin[js.Any]): Boolean = js.native
  
  def heatMap(parent: String): HeatMap = js.native
  def heatMap(parent: String, chartGroup: String): HeatMap = js.native
  
  def htmlLegend(): HtmlLegend = js.native
  
  def instanceOfChart(`object`: js.Any): Boolean = js.native
  
  def legend(): Legend = js.native
  
  // http://dc-js.github.io/dc.js/docs/html/dc.lineChart.html
  def lineChart(parent: String): LineChart = js.native
  def lineChart(parent: String, chartGroup: String): LineChart = js.native
  def lineChart(parent: CompositeChart): LineChart = js.native
  def lineChart(parent: CompositeChart, chartGroup: String): LineChart = js.native
  
  var logger: Logger = js.native
  
  def numberDisplay(parent: String): NumberDisplayWidget = js.native
  def numberDisplay(parent: String, chartGroup: String): NumberDisplayWidget = js.native
  
  def optionalTransition(enable: Boolean): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: js.Function): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: js.Function, delay: js.Function): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: js.Function, delay: js.Function, name: String): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: js.Function, delay: Double): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: js.Function, delay: Double, name: String): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: js.Function, delay: Unit, name: String): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: Double): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: Double, delay: js.Function): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: Double, delay: js.Function, name: String): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: Double, delay: Double): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: Double, delay: Double, name: String): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: Double, delay: Unit, name: String): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: Unit, delay: js.Function): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: Unit, delay: js.Function, name: String): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: Unit, delay: Double): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: Unit, delay: Double, name: String): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  def optionalTransition(enable: Boolean, duration: Unit, delay: Unit, name: String): js.Function1[
    /* selection */ Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    (js.Function4[
      /* selections */ Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ], 
      /* duration */ js.UndefOr[Double | js.Function], 
      /* delay */ js.UndefOr[Double | js.Function], 
      /* name */ js.UndefOr[String], 
      (Transition_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ]) | (Selection_[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
      ])
    ]) | (Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ])
  ] = js.native
  
  def `override`(obj: js.Any, functionName: String, newFunction: js.Function): Unit = js.native
  
  def pieChart(parent: String): PieChart = js.native
  def pieChart(parent: String, chartGroup: String): PieChart = js.native
  def pieChart(
    parent: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ]
  ): PieChart = js.native
  def pieChart(
    parent: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    chartGroup: String
  ): PieChart = js.native
  def pieChart(parent: Node): PieChart = js.native
  def pieChart(parent: Node, chartGroup: String): PieChart = js.native
  
  def pluck(n: String): Accessor[js.Any, js.Any] = js.native
  def pluck(n: String, f: Accessor[js.Any, js.Any]): Accessor[js.Any, js.Any] = js.native
  
  var printers: Printers = js.native
  
  def redrawAll(): Unit = js.native
  def redrawAll(group: String): Unit = js.native
  
  def refocusAll(): Unit = js.native
  def refocusAll(group: String): Unit = js.native
  
  def registerChart(chart: BaseMixin[js.Any]): Unit = js.native
  def registerChart(chart: BaseMixin[js.Any], group: String): Unit = js.native
  
  def renderAll(): Unit = js.native
  def renderAll(group: String): Unit = js.native
  
  var round: Round = js.native
  
  def rowChart(parent: String): RowChart = js.native
  def rowChart(parent: String, chartGroup: String): RowChart = js.native
  
  def scatterPlot(parent: String): ScatterPlot = js.native
  def scatterPlot(parent: String, chartGroup: String): ScatterPlot = js.native
  
  def selectMenu(parent: String): SelectMenu = js.native
  def selectMenu(parent: String, chartGroup: String): SelectMenu = js.native
  
  def seriesChart(parent: String): SeriesChart = js.native
  def seriesChart(parent: String, chartGroup: String): SeriesChart = js.native
  
  def sunburstChart(parent: String): SunburstChart = js.native
  def sunburstChart(parent: String, chartGroup: String): SunburstChart = js.native
  def sunburstChart(
    parent: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ]
  ): SunburstChart = js.native
  def sunburstChart(
    parent: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    chartGroup: String
  ): SunburstChart = js.native
  def sunburstChart(parent: Node): SunburstChart = js.native
  def sunburstChart(parent: Node, chartGroup: String): SunburstChart = js.native
  
  def textFilterWidget(parent: String): TextFilterWidget = js.native
  def textFilterWidget(parent: String, chartGroup: String): TextFilterWidget = js.native
  
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ]
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: js.Function
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: js.Function,
    delay: js.Function
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: js.Function,
    delay: js.Function,
    name: String
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: js.Function,
    delay: Double
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: js.Function,
    delay: Double,
    name: String
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: js.Function,
    delay: Unit,
    name: String
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: Double
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: Double,
    delay: js.Function
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: Double,
    delay: js.Function,
    name: String
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: Double,
    delay: Double
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: Double,
    delay: Double,
    name: String
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: Double,
    delay: Unit,
    name: String
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: Unit,
    delay: js.Function
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: Unit,
    delay: js.Function,
    name: String
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: Unit,
    delay: Double
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: Unit,
    delay: Double,
    name: String
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  def transition(
    selections: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    duration: Unit,
    delay: Unit,
    name: String
  ): (Transition_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) | (Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ]) = js.native
  
  var units: Units = js.native
  
  var utils: Utils = js.native
  
  // http://dc-js.github.io/dc.js/docs/html/core.js.html, Line 20
  var version: String = js.native
}
